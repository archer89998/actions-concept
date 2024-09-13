package org.sanbox.check;

import lombok.Data;

import java.util.List;

@Data
public class BaseCheck {
    private List<String> parameters;
    private List<String> expectedConditions;
}
