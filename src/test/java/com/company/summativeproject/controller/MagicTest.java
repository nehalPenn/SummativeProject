package com.company.summativeproject.controller;

import com.company.summativeproject.models.Answer;
import com.company.summativeproject.models.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest({MagicController.class})
public class MagicTest {
    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper mapper = new ObjectMapper();
    private List<Answer> answerList;

    public MagicTest () {}

    @BeforeEach
    public void setUp() {
    }

    // Testing PUT /magic
    @Test
    public void shouldReturnRandomAnswer() throws Exception {
        Answer question = new Answer();
        question.setQuestion("Will I win the lottery?");
        String inputJson = this.mapper.writeValueAsString(question);
        this.mockMvc.perform(MockMvcRequestBuilders.post("/magic", new Object[0]).content(inputJson).contentType(MediaType.APPLICATION_JSON)).andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isCreated());

    }
}
