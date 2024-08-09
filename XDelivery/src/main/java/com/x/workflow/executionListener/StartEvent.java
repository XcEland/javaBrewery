package com.x.workflow.executionListener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StartEvent implements ExecutionListener{

    Logger logger = LoggerFactory.getLogger(StartEvent.class);

    @Override
    public void notify(final DelegateExecution delegateExecution){
        logger.info("This is execution listener, event: ".concat(delegateExecution.getEventName()));
    }
}
