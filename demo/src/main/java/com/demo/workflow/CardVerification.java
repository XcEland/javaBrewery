package com.demo.workflow;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import jakarta.inject.Named;

@Named
public class CardVerification implements JavaDelegate {

    boolean isCardValid = false;

    @Override
    public void execute(DelegateExecution execution) throws Exception{

        String cardHolderName = (String) execution.getVariable("cardHolderName");
        String cardNumber = (String) execution.getVariable("cardNumber");
        String expiryDate = (String) execution.getVariable("expiryDate");
        String cvv = (String) execution.getVariable("cvv");

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
        // execution.setVariable("isCardValid", isCardValid);
    }
    
}