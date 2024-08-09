package com.x.workflow.taskListener;

import org.camunda.bpm.engine.delegate.TaskListener;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.camunda.bpm.engine.delegate.DelegateTask;

public class CompleteTaskListener implements TaskListener{
    
    Logger logger = LoggerFactory.getLogger(CompleteTaskListener.class);
    @Override
    public void notify(final DelegateTask delegateTask){
        logger.info("This is a task listener, asignee: ".concat(delegateTask.getAssignee()));
    }
}
