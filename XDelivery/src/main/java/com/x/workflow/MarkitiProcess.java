package com.x.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named
public class MarkitiProcess implements JavaDelegate{
    
    @Override
    public void execute(DelegateExecution execution) throws Exception{
        System.out.println("Order taken");
    }
}
