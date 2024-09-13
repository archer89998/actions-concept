import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.sanbox.Step;
import org.sanbox.action.ActionName;
import org.sanbox.check.CheckName;
import org.sanbox.counter.Counter;

import java.util.Arrays;

import static org.sanbox.action.ActionFactory.createAction;
import static org.sanbox.check.CheckFactory.createCheck;

public class UiTest1 {
    private Counter stepCounter = new Counter();

    @Test
    @Feature("A")
    @Story("c")
    void sandboxUi() {
        new Step(createAction(stepCounter, ActionName.UI_CLICK, Arrays.asList("refer")),
                createCheck(CheckName.CHECK_IU_ELEMENT_CONTAINS_TEXT, "//xPath", "expected"))
                .execute();
        new Step(createAction(stepCounter, ActionName.UI_CLICK, Arrays.asList("refer")),
                createCheck(CheckName.CHECK_IU_ELEMENT_CONTAINS_TEXT, "//xPath", "expected"))
                .execute();
        new Step(createAction(stepCounter, ActionName.UI_CLICK, Arrays.asList("refer")),
                createCheck(CheckName.CHECK_IU_ELEMENT_CONTAINS_TEXT, "//xPath", "expected"))
                .execute();
    }

}
