package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;
import starter.search.SearchResult;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.*;
import static starter.matchers.StringContainsIgnoringCase.containsIgnoringCase;

public class ejemplo_test2 {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ejemplo test")
    public void initial(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.test_page2());
    }

    @When("ella/el buscan {string}")
    public void search_for_test(String term) {

        withCurrentActor(
                SearchFor.term(term)
        );
    }

    @Then("validar titulos {string}")
    public void validate_titles(String term) {
        withCurrentActor(
                Ensure.thatTheAnswersTo(SearchResult.titles())
                        .allMatch("a title containing '" + term + "'",
                                title -> title.toLowerCase().contains(term.toLowerCase()))

        );

        theActorInTheSpotlight().should(
                seeThat("search result titles",
                        SearchResult.titles(), hasSize(greaterThan(0))),
                seeThat("search result titles",
                        SearchResult.titles(), everyItem(containsIgnoringCase(term)))
        );
    }
}
