package starter.tasks.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class Login {
    public static Performable usingCredentials(String username, String password) {
        return Task.where("{0} logs on to the Frequent Flyer app",
                Open.url("http://localhost:3000"),
                Click.on(Toolbar.LOGIN_MENU_ITEM),
                Enter.theValue(username).into("#username"),
                Enter.theValue(password).into("#password"),
                Click.on("#login-button")
        );
    }
}
