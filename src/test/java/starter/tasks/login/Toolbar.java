package starter.tasks.login;

import net.serenitybdd.screenplay.targets.Target;

class Toolbar {
    static Target LOGIN_MENU_ITEM = Target.the("Login menu").locatedBy("//span[normalize-space()='Login']");
}
