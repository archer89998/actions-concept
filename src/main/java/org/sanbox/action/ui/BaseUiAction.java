package org.sanbox.action.ui;

import lombok.Data;
import org.sanbox.counter.Counter;

import java.util.List;

@Data
public class BaseUiAction {
    private Integer stepNumber;
    private Counter stepCounter;
    private String description;
    private List<String> parameters;
}
