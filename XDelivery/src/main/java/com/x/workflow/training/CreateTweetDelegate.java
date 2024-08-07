package com.x.workflow.training;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateTweetDelegate implements JavaDelegate {
  private final Logger LOGGER = LoggerFactory.getLogger(CreateTweetDelegate.class.getName());
  TwitterService twitter = new TwitterService();
  
  @Override  
  public void execute(DelegateExecution execution) throws Exception {
    String content = "I did it! KaribuTech";
    twitter.updateStatus(content);
  }

}



