package com.example.M2ChallengeWheatRayce.controller;

import com.example.M2ChallengeWheatRayce.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MonthController {

    private static List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month("January", 1),
            new Month("February", 2),
            new Month("March", 3),
            new Month("April", 4),
            new Month("May", 5),
            new Month("June", 6),
            new Month("July", 7),
            new Month("August", 8),
            new Month("September", 9),
            new Month("October", 10),
            new Month("November", 11),
            new Month("December", 12)
    ));

    Random randomNumber = new Random();

    int randomNumberBetween1and12 = randomNumber.nextInt(13);

    @RequestMapping(value = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonthByMonthNumber(@PathVariable int monthNumber){
        if (monthNumber < 1 || monthNumber > 12){
            throw new IllegalArgumentException("Number must be between 1 and 12");
        }

        Month foundMonth = null;

        for(Month month : monthList){
            if(month.getMonthNumber() == monthNumber){
                foundMonth = month;
                break;
            }
        }

        return foundMonth;

    }

    @RequestMapping(value = "/randomMonth", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getRandomMonth(){
        return monthList.get(randomNumberBetween1and12);
    }

}
