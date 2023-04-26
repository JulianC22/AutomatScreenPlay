package co.com.AutScreenPlay.stepdefinitions;

import co.com.AutScreenPlay.questions.Verify;
import co.com.AutScreenPlay.tasks.LogIn;
import co.com.AutScreenPlay.tasks.OpenPagi;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class MyStepdefs {
    @Before
    public void startStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that Catalina enters the XYZ app$")
    public void thatCatalinaEntersTheXYZApp() {
        OnStage.theActorCalled("Catalina").wasAbleTo(OpenPagi.urlApp());
        // throw new PendingException();
    }

    @When("^she enters her credentials to enters the app$")
    public void sheEntersHerCredentialsToEntersTheApp(DataTable table) {

        OnStage.theActorInTheSpotlight().attemptsTo(LogIn.credentials(table));
    }

    @Then("^verify that she was able to log in correctly$")
    public void verifyThatSheWasAbleToLogInCorrectly() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                Verify.result(), Matchers.equalTo("MENU") ));
    }
}
