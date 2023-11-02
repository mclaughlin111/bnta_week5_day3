package com.example.top_trumps_start_code.services;


import com.example.top_trumps_start_code.models.Card;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    private Card cardOne;
    private Card cardTwo;

    public CardService() {
    }

    public Card getCardOne() {
        return cardOne;
    }

    public void setCardOne(Card cardOne) {
        this.cardOne = cardOne;
    }

    public Card getCardTwo() {
        return cardTwo;
    }

    public void setCardTwo(Card cardTwo) {
        this.cardTwo = cardTwo;
    }

    public String checkWinner(Card cardOne, Card cardTwo) {
        this.cardOne = cardOne;
        this.cardTwo = cardTwo;

        if (cardOne.getCardValue() > cardTwo.getCardValue()) {
            return cardOne.getRank() + " of "+ cardOne.getSuit() + " is Greater";
        } else {
            return cardTwo.getRank() + " of "+ cardTwo.getSuit() + " is Greater";
        }
    }

}
