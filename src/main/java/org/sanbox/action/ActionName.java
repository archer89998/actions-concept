package org.sanbox.action;

import lombok.Getter;

@Getter
public enum ActionName {
    UI_OPEN("UI OPEN"),
    UI_GET("UI GET"),
    UI_WAIT("UI WAIT"),
    UI_CLICK("UI CLICK");

    private String action;

    ActionName(String action) {
        this.action = action;
    }
}
