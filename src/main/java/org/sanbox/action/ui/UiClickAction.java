package org.sanbox.action.ui;

import io.qameta.allure.Step;
import org.sanbox.action.Action;
import org.sanbox.counter.Counter;

import java.util.List;

public class UiClickAction extends BaseUiAction implements Action {

    public UiClickAction(Counter stepNumber, String description, List<String> parameters) {
      this.setStepNumber(stepNumber.getStepNumber().get());
      this.setStepCounter(stepNumber);
      this.setDescription(description);
      this.setParameters(parameters);
    }

    @Step("{this.stepNumber}. {this.description} with parameters {this.parameters}")
    public void execute() {
    }


}
