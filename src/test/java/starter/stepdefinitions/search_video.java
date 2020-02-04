package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.task.Search_task;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class search_video {
/*
        @Before
        public void setTheStage() { OnStage.setTheStage(new OnlineCast());}

 */

String actor;


    @Given("(.*) ejemplo test")
    public void initial(String actor) {
        this.actor = actor;
    }

    @When("el buscan {string}")
    public void el_buscan(String video) {
        theActorCalled(actor).attemptsTo(
                NavigateTo.search_vidio_on_youtube()
        );

    }
    @Then("validar titulos {string}")
    public void validate_titles(String term) {
        withCurrentActor(Search_task.search_one_video(term));
    }


}

