package com.x.workflow;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.jvnet.hk2.annotations.Service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import jakarta.inject.Named;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;

@Named
public class CardVerification implements JavaDelegate {

    @Autowired
    private EmailServiceImpl mailSender;

    @Override
    public void execute(DelegateExecution execution) throws Exception{

        String cardHolderName = (String) execution.getVariable("cardHolderName");
        String cardNumber = (String) execution.getVariable("cardNumber");
        String expiryDate = (String) execution.getVariable("expiryDate");
        String cvv = (String) execution.getVariable("cvv");
        String email = "findyandx@gmail.com";

        if("Mark Doe".equals(cardHolderName) &&
        "1234567890".equals(cardNumber) &&
        "12/25".equals(expiryDate)&&
        "123".equals(cvv)){
            execution.setVariable("cardValid", true);
            String subject = "Card Added Successfully";
            String message = "Card added on Platform X successfully";
            // sendEmail(email, subject,message);
        }else{
            

            execution.setVariable("cardvalid", false);
            throw new BpmnError("InvalidCardDetails", "The provided credit card details are invalid.");
        }
    }

    @Value("$(spring.mail.username)")
    private String fromEmailId;

    // private void sendEmail(String to, String subject, String text) throws MessagingException{
    //     SimpleMailMessage mailMessage = new SimpleMailMessage();
    //     // mailMessage.setFrom(fromEmailId);
    //     mailMessage.setTo(to);
    //     mailMessage.setSubject(subject);
    //     mailMessa     ge.setText(text);

    //     mailSender.send(mailMessage);
    // }
    
}
