package org.sanbox.check;

import lombok.Getter;

@Getter
public enum CheckName {
    CHECK_IU_ELEMENT_CONTAINS_TEXT("IU ELEMENT CONTAINS TEXT"),
    CHECK_IU_ELEMENT_EQUALS_TEXT("IU ELEMENT EQUALS TEXT");

    private String check;

    CheckName(String check) {
        this.check = check;
    }

}
