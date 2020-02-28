package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.model.dashBoard.OverViewData_DashBoard;
import starter.model.dashBoard.dashboard;
import starter.model.menu.OverViewData_menu;
import starter.navigation.NavigateTo;
import starter.task.Builder.login_Builder_patron;
import starter.task.facebook.createNewUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class FacebookRegister {

String mail;
String pass;
String name;
String lastname;
String phone;

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
                        .phone (this.phone)
                        .sendData (true)

        );
    }

    @Then("crear el usurio {string}")
    public void crear_el_usurio(String phone) {
        this.phone=phone;
        theActorCalled(mail).attemptsTo(


        );
    }

}
