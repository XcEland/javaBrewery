package com.x.workflow;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import java.util.List;
import java.util.ArrayList;


import jakarta.inject.Named;


@Named
public class PaymentVerification implements JavaDelegate {

    // private static List<String> CREDIT_CARDS = new ArrayList<>();
    
    boolean isCardValid = false;

    @Override
    public void execute(DelegateExecution execution) throws Exception{
        // CREDIT_CARDS.addAll(new CreditCard("John Doe", "01235678900", "12/45", "345"));

        String cardHolderName = (String) execution.getVariable("cardHolderName");
        String cardNumber = (String) execution.getVariable("cardNumber");
        String expiryDate = (String) execution.getVariable("expiryDate");
        String cvv = (String) execution.getVariable("cvv");

        // CreditCard inputCard = new CreditCard(cardHolderName, cardNumber, cvv, expiryDate);
        // if(cardHolderName==null || cardNumber==null || cardHolderName.trim().isEmpty()){
        //     throw new BpmnError("ERROR_MISSING_CREDIT_CARD_DETAILS","Incomplete Credit Card DetailsProvided");
        // }
        // if(CREDIT_CARDS.contains(inputCard)){
        //     execution.setVariable("cardStatus", "VALID");
        // }else{
        //     execution.setVariable("cardStatus", "INVALID");
        //     throw new BpmnError("ERROR_INVALID_CREDIT_CARD","Credit Card is not Valid");
        // }

        if("Mark Doe".equals(cardHolderName) &&
        "1234567890".equals(cardNumber) &&
        "12/25".equals(expiryDate)&&
        "123".equals(cvv)){
            // execution.setVariable("cardValid", true);
            isCardValid = true;
            System.out.println("Card is valid");
        }else{
            throw new BpmnError("Invalid_Card", "The provided credit card details are invalid.");
        }
        execution.setVariable("isCardValid", isCardValid);
    }
    
}