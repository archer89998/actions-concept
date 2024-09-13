package org.sanbox;

import lombok.Setter;
import org.sanbox.action.Action;
import org.sanbox.check.Check;
import org.sanbox.counter.Counter;

@Setter
public class Step {
    private Action action;
    private Check check;

    public Step(Action action, Check check) {
        this.setAction(action);
        this.setCheck(check);
    }

    public void execute() {
        action.execute();
        check.check();
        action.getStepCounter().iteration();
    }}
