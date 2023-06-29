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



    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public Definition getWordOfDay() {

        LocalDate date = LocalDate.now();
        DayOfWeek day = date.getDayOfWeek();

        if (day.equals(DayOfWeek.MONDAY)) {
            System.out.println("Something!");
        }

        return null;
    }
}
