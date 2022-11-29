package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("delegate")
public class ParamDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        String test = (String) delegateExecution.getVariable("test");
        boolean bool;

        if(test.equals("y")) {
            bool = true;
        } else {
            bool = false;
        }
        delegateExecution.setVariable("isBool", bool);
    }
}
