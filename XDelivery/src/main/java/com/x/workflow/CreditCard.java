package com.x.workflow;

public class CreditCard {
    private String cardholderName;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCard(String cardholderName, String cardNumber, String cvv, String expiryDate){
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.cvv =cvv;
        this.expiryDate=expiryDate;
    }

    public String getCardholderName(){
        return cardholderName;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public String getCvv(){
        return cvv;
    }

    public String getExpiryDate(){
        return expiryDate;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return cardNumber.equals(that.cardNumber);
    }

    @Override
    public int hashCode(){
        return cardNumber.hashCode();
    }
}
