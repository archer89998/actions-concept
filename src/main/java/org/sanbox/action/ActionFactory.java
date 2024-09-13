package org.sanbox.action;

import org.sanbox.action.ui.UiClickAction;
import org.sanbox.counter.Counter;

import java.util.List;

public class ActionFactory {

    public static Action createAction(Counter stepStepCounter, ActionName actionName, List<String> parameters) {

        switch (actionName) {
            case UI_CLICK:
            //validation parameters
                return new UiClickAction(stepStepCounter, actionName.getAction(), parameters);

            default:
                throw new InvalidActionException("%s action is invalid", actionName.toString());
        }
    }
}
