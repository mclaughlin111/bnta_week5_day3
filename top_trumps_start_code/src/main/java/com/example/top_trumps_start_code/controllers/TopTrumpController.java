package com.example.top_trumps_start_code.controllers;


import com.example.top_trumps_start_code.services.CardService;
import com.example.top_trumps_start_code.models.Card;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/card")
public class TopTrumpController {

    @PostMapping
    public ResponseEntity<String> submitCard(@RequestBody ArrayList<Card> givenCard){
        Card cardOne = givenCard.get(0);
        Card cardTwo = givenCard.get(1);
//        String returnString = String.valueOf(cardOne.getRank()) + " " + String.valueOf(cardTwo.getRank()) ;


        String returnMessage = new CardService().checkWinner(cardOne, cardTwo);

        return new ResponseEntity<>(returnMessage, HttpStatus.CREATED);


    }

//    @GetMapping
//    public ResponseEntity<String> checkCard() {
////        String reply = Card.getCardValue();
////        return new ResponseEntity<>(reply, HttpStatus.OK);
//    }


}
