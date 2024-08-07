package com.x.workflow;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import jakarta.inject.Named;

@Named
public class MakePayment implements JavaDelegate{
    
    private static double clientBalance = 150.00;

    @Override
    public void execute(DelegateExecution execution) throws Exception{
        double paymentAmount = 80.00;
        System.out.println("Payment made");
        Double paymentAmount1 = (Double) execution.getVariable("package");
        
        clientBalance = clientBalance - paymentAmount;
        if(clientBalance>0){
            execution.setVariable("paymentStatus", "SUCCESS");
        sendMessageToClient("Payment Successfu. Amount: $"+ paymentAmount);
        System.out.println(paymentAmount1);
        }else{
            throw new BpmnError("ERROR_INSUFFICIENT_BALANCE", "Insufficient balance to make payment");
        }      
    }

    private void sendMessageToClient(String message) {
        System.out.println("Message to Client: " + message);
    }
}
