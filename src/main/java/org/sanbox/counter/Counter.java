package org.sanbox.counter;

import lombok.Data;
import lombok.Getter;

import java.util.concurrent.atomic.AtomicInteger;

@Data
public class Counter {
    private AtomicInteger stepNumber;

    public Counter(){
        this.setStepNumber(new AtomicInteger(1));
    }

    public void iteration() {
        stepNumber.incrementAndGet();
    }

}
