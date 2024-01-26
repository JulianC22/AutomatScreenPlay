package co.com.AutScreenPlay.stepdefinitions;

import co.com.AutScreenPlay.questions.Verify;
import co.com.AutScreenPlay.tasks.ExpensivePurch;
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

    //1st Step Definition - Log In -----------------------------------------------------------
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

    //2nd Step Definition - The Expensive ----------------------------------------------------
    @Given("^that Catalina want to buy the most expensive subscription$")
    public void thatCatalinaWantToBuyTheMostExpensiveSubscription() {
        OnStage.theActorCalled("Catalina").wasAbleTo(ExpensivePurch.urlApp());
    }

    @When("^she enters in Pricing Table menu to select her expensive purchase$")
    public void sheEntersInPricingTableMenuToSelectHerExpensivePurchase() {
    }

    @Then("^she selects Ultra Subscription$")
    public void sheSelectsUltraSubscription() {
    }

    // 3rd Step Definition - The Cheapest ---------------------------------------------------
    @Given("^that Catalina want to buy the cheapest subscription$")
    public void thatCatalinaWantToBuyTheCheapestSubscription() {
    }

    @When("^she enters in Pricing Table menu to select her cheapest purchase$")
    public void sheEntersInPricingTableMenuToSelectHerCheapestPurchase() {
    }

    @Then("^she selects Starter Subscription$")
    public void sheSelectsStarterSubscription() {
    }

    //4th Step Definition - Fill the Form --------------------------------------------------
    @Given("^that Catalina must to Fill her personal data in a form$")
    public void thatCatalinaMustToFillHerPersonalDataInAForm() {
    }

    @When("^she enters her personal data in the form$")
    public void sheEntersHerPersonalDataInTheForm() {
    }

    @Then("^she gives click in minimize button$")
    public void sheGivesClickInMinimizeButton() {
    }
}
