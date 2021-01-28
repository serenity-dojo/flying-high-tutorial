package starter.tasks.navigation;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.*;

public class OperationsSection {

    private static final String CURRENT_USERNAME = "//div[@class='operation-section']//button[5]";

    public static Question<String> username() {
        return Text.of(CURRENT_USERNAME).asAString();
    }
}
