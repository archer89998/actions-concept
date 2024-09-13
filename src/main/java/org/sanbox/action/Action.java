package org.sanbox.action;

import org.sanbox.counter.Counter;

import java.util.List;

public interface Action {

    Integer getStepNumber();
    Counter getStepCounter();
    void setStepNumber(Integer stepNumber);
    String getDescription();
    List<String> getParameters();


    void execute();
}
