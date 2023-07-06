package com.company.summativeproject.controller;

import com.company.summativeproject.models.Quote;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private List<Quote> quoteList;

    public QuoteController() {
        Quote marie = new Quote("Marie Curie", "One never notices what has been done; one can only see what remains to be done.", 0);
        Quote walter = new Quote("Walter Lippmann", "Where all think alike, no one thinks very much.", 1);
        Quote cato = new Quote("Cato the Elder", "Grasp the subject, the words will follow.", 2);
        Quote ayn = new Quote("Ayn Rand", "Learn to value yourself, which means: to fight for your happiness.", 3);
        Quote jill = new Quote("Jill Stein", "At the end of the day, it's night.", 4);
        Quote frank = new Quote("Frank Walter", "Knowledge is power.", 5);
        Quote bob = new Quote("Bob Fisher", "What will be, will be.", 6);
        Quote sid = new Quote("Sid Lym", "Birds of a feather flock together.", 7);
        Quote brit = new Quote("Brit Knee", "What happens in Vegas, stays in Vegas.", 8);
        Quote chinendu = new Quote("Chinendu Smith", "He who eats quietly, eats twice.", 9);
        Quote ken = new Quote("Ken Doll", "Lead by example and others will follow.", 10);

        quoteList = Arrays.asList(marie, walter, cato, ayn, jill, frank, bob, sid, brit, chinendu, ken);
    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quote getRandomQuote() {
        //random quote
        Random random = new Random();
        //random index
        int index = random.nextInt(quoteList.size());
        //get that random object from this
        Quote randomQuote = quoteList.get(index);
        return randomQuote;
    }

}
