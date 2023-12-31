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
        Definition software = new Definition(2, "software", "a set of instructions, data or programs used to operate computers and execute specific tasks");
        Definition soccer = new Definition(3, "soccer", "a game played by two teams of eleven players with a round ball");
        Definition manikin = new Definition(4, "manikin", "a life-size dummy used to display clothes");
        Definition cordial = new Definition(5, "cordial", "politely warm and friendly");
        Definition canoodle = new Definition(6, "canoodle", "fondle or pet affectionately");
        Definition civilian = new Definition(7, "civilian", "a nonmilitary citizen");
        Definition revolt = new Definition(8, "revolt", "rise up against an authority");
        Definition fascist = new Definition(9, "fascist", "an adherent of right-wing authoritarian views");
        Definition upsurge = new Definition(10, "upsurge", "a sudden or abrupt strong increase");


        defList = Arrays.asList(programmer, software, soccer, manikin, cordial, canoodle, civilian, revolt, fascist, upsurge);

    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public Definition getWordOfDay() {

        LocalDate date = LocalDate.now();
        DayOfWeek day = date.getDayOfWeek();

        //random word of day
        Random random = new Random();
        //random index
        int index = random.nextInt(defList.size());
        //get that random object from this
        Definition randomDef = defList.get(index);


        return randomDef;
    }
}
