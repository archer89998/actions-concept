package org.sanbox.check;

import org.sanbox.action.InvalidActionException;

public class CheckFactory {

    public static Check createCheck(CheckName checkName, String parameter, String expectedResult) {
        switch (checkName) {
            case CHECK_IU_ELEMENT_CONTAINS_TEXT:
                return new UiElementContainsText(parameter, expectedResult);
            default:
                throw new InvalidCheckException("%s check is invalid", checkName.toString());
        }

    }


}
