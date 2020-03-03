package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.model.facebook_publiction.facebook_register;
import starter.navigation.NavigateTo;
import starter.task.facebook.LoginAndLikePublication;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FacebookLoginAndLike {

String email;
String pass;
String url;


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("{string} login user {string}")
    public void login_user(String email, String pass) {
        this.email = email;
        this.pass = pass;
        setTheStage();
        theActorCalled(this.email).attemptsTo(
                NavigateTo.FacebbokHome (),
                LoginAndLikePublication
                        .with ()
                        .mailLogin (this.email)
                        .passLogin (this.pass)
                        .sendData (false)
        );


    }

    @When("{string} publicacion a darle like")
    public void publicacion_a_darle_like(String url) {
      this.url =url;

        theActorCalled(this.email).attemptsTo(
                NavigateTo.FacebookPublication (),
                LoginAndLikePublication
                        .with ()
                        .urlLogin (this.url)
                        .sendData (true)
        );

    }

    @Then("serra sección")
    public void serra_sección() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
