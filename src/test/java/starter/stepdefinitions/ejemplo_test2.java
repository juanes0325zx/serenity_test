package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.task.CreditAvaliable;
import starter.task.user_login_task;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ejemplo_test2 {

String user;
String pass;
    @Before
    public void setTheStage() {

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ejemplo test")
    public void initial(String user) {
        this.user=user;

    }

    @When("ella/el buscan {string}")
    public void search_for_test(String pass) {
        theActorCalled(user).attemptsTo(
                NavigateTo.test_page2(),
                user_login_task.login_user_app(user,pass)

        );
    }

    @Then("validar titulos {string}")
    public void validate_titles(String validate) {
    }
     //theActorInTheSpotlight


}
