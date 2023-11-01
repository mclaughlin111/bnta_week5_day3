package com.example.top_trumps_start_code.controllers;


import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/card")
public class TopTrumpController {

    @PostMapping
    public ResponseEntity<String> startGame(ArrayList<Card> givenCard){
        this.givenCard =
//        Card givenCard = new Card();
        return new ResponseEntity<>("Thank you", HttpStatus.CREATED);
    }




}
