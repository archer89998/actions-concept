package org.sanbox.check;

import lombok.Setter;

import java.util.List;
@Setter
public class UiElementContainsText implements Check {
    private String elementXPath;
    private String expectedSting;

    public UiElementContainsText(String elementXPath, String expectedSting) {
        this.setElementXPath(elementXPath);
        this.setExpectedSting(expectedSting);
    }
    public void check() {

    }
}
