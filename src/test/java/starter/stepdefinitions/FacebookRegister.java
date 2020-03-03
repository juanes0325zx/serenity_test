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
import starter.task.facebook.createNewUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FacebookRegister {

String mail;
String pass;
String name;
String lastname;
String phone;


/*
    Given "<email>" usuario nuevo con "<password>"
    When "<name>" nombre ,"<lastname>" apellido
    Then  crear el usurio "<phone>"


    Examples:
      | name      | lastname                    | email                  | password         | phone      |
      | Calos Andres | Montoya  Garcia               | AndresMyGa464565@mailboxt.com | **fghfg5151_M** | 3042016808 |


 */

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} usuario nuevo con {string}")
    public void usuario_nuevo_con(String mail, String pass) {
      //inicializar las variables
        this.mail=mail;
        this.pass=pass;
        setTheStage();
    }

    @When("{string} nombre ,{string} apellido")
    public void nombre_apellido(String name, String lastname) {
        this.name=name;
        this.lastname=lastname;
        theActorCalled(mail).attemptsTo(
                NavigateTo.FacebbokHome (),
                createNewUser
                        .with ()
                        .name (this.name)
                        .mail (this.mail)
                        .lastname (this.lastname)
                        .pass (this.pass)
                        .sendData (true)

        );
    }

    @Then("crear el usurio {string}")
    public void crear_el_usurio(String phone) {
        this.phone=phone;
        theActorCalled(mail).attemptsTo(
                WaitUntil.the (facebook_register.chk_captcha, isVisible ()).forNoMoreThan (10).seconds (),
                Click.on(facebook_register.chk_captcha),
                Click.on(facebook_register.btn_captcha_continue)

        );
    }

}
