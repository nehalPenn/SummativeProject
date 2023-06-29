package com.company.summativeproject.controller;

import com.company.summativeproject.models.Definition;
import com.company.summativeproject.models.Quote;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {

    private List<Definition> defList;

    public WordController() {

        Definition programmer = new Definition(1, "programmer", "a person who writes computer programs.");
        Definition software = new Definition(1, "software", "a set of instructions, data or programs used to operate computers and execute specific tasks");

        defList = Arrays.asList(programmer, software);

    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public Definition getWordOfDay() {

        LocalDate date = LocalDate.now();
        DayOfWeek day = date.getDayOfWeek();

        //random quote
        Random random = new Random();
        //random index
        int index = random.nextInt(defList.size());
        //get that random object from this
        Definition randomDef = defList.get(index);


        return randomDef;
    }
}
