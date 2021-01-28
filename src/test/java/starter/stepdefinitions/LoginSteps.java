package starter.stepdefinitions;

import com.serenitydojo.flyinghigh.domain.FrequentFlyerAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.tasks.login.Login;
import starter.tasks.navigation.OperationsSection;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginSteps {

    FrequentFlyerAccount frequentFlyerAccount;

    @Given("{actor} has a Frequent Flyer account")
    public void hasFrequentFlyerAccount(Actor actor) {
        frequentFlyerAccount = FrequentFlyerAccount.valueOf(actor.getName());
    }

    @When("{actor} logs in using her credentials")
    public void userLogsInAs(Actor actor) {
        actor.attemptsTo(
                Login.usingCredentials(frequentFlyerAccount.getUsername(), frequentFlyerAccount.getPassword())
        );
    }

    @Then("{actor} should be taken to the booking page")
    public void shouldBeOnTheBookingPage(Actor actor) {
        actor.should(
                seeThat(OperationsSection.username(), equalTo(frequentFlyerAccount.getUsername()))
        );
    }
}
