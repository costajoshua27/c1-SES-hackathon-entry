package com.dawidjk2.sesfrontend;

import java.io.Serializable;

public class Card implements Serializable {

    private String cardName;
    private String cardNumber;
    private String previousActivity;

    public Card(String cardName, String cardNumber, String previousActivity) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.previousActivity = previousActivity;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPreviousActivity() {
        return previousActivity;
    }

    public void setPreviousActivity(String previousActivity) {
        this.previousActivity = previousActivity;
    }
}
