package com.company.summativeproject.controller;

import com.company.summativeproject.models.Answer;
import com.company.summativeproject.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MagicController {
    private List<Answer> answerResponse;

    public MagicController() {
        answerResponse = new ArrayList<>();
        Answer response1 = new Answer("yes", 1);
        Answer response2 = new Answer("no", 2);
        Answer response3 = new Answer("maybe", 3);
        Answer response4 = new Answer("try again", 4);
        Answer response5 = new Answer("perhaps", 5);
        Answer response6 = new Answer("I say yes", 6);
        answerResponse = Arrays.asList(response1, response2, response3, response4, response5, response6);

    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer returnMagicAnswer(@RequestBody Answer answer) {

        //random answer
        Random random = new Random();
        //random index
        int index = random.nextInt(answerResponse.size());
        //get that random object from this
        Answer randomAnswer = answerResponse.get(index);

        //Returns the question asked by the user, with a random answer
        answer.setAnswer(randomAnswer.getAnswer());
        answer.setId(randomAnswer.getId());


        return answer;
    }



}
