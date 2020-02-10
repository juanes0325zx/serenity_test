package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.model.dashBoard.dashboard;
import starter.navigation.NavigateTo;
import starter.model.dashBoard.OverViewData_DashBoard;
import starter.model.menu.OverViewData_menu;
import starter.search.AddATodoItem;
import starter.task.Builder.login_Builder_patron;
import starter.task.StepBuilder.user_login_task;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class ejemplo_test {

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
               /* user_login_task.login_user_app(user,pass)*/
                login_Builder_patron
                        .with ()
                        .username (user)
                        .pass (pass)
                        .sendData (true)

        );
    }

    @Then("validar titulos {string}")
    public void validate_titles(String validate) {

theActorInTheSpotlight().should (
        seeThat ("prueba de visualizacion credito", OverViewData_DashBoard.credit_avaliable (),equalTo (validate)),
        seeThat ("prueba de visualizacion balance", OverViewData_DashBoard.total_balance (),equalTo ("$350%7")),
        seeThat ("prueba de visualizacion credito", OverViewData_DashBoard.credit_avaliable (),equalTo (validate))
        ,seeThat ("prueba de visualizacion opción del menu credit cards",OverViewData_menu.CREDIT_CARDS(),equalTo ("Credit cards"))
        ,seeThat ("prueba de visualizacion opción del menu debit cards",OverViewData_menu.DEBIT_CARDS(),equalTo ("Debit cards"))
        ,seeThat ("prueba de visualizacion opción del menu lending",OverViewData_menu.LENDING (),equalTo ("Lending"))
        ,seeThat ("prueba de visualizacion opción del menu loans",OverViewData_menu.LOANS (),equalTo ("Loans"))
        ,seeThat ("prueba de visualizacion opción del menu mortage",OverViewData_menu.MORTAGAGES (),equalTo ("Mortgages"))
);
        theActorCalled(user).attemptsTo(
                //AddATodoItem.called ("prueba de visualizacion tabla fila 1 columna 1"),
                 Ensure.that(dashboard.TableRow_1_CELL_1).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 1 columna 2"),
                Ensure.that(dashboard.TableRow_1_CELL_2).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 1 columna 3"),
                Ensure.that(dashboard.TableRow_1_CELL_3).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 1 columna 4"),
                Ensure.that(dashboard.TableRow_1_CELL_4).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 1 columna 5"),
                Ensure.that(dashboard.TableRow_1_CELL_5).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 2 columna 1"),
                Ensure.that(dashboard.TableRow_2_CELL_1).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 2 columna 2"),
                Ensure.that(dashboard.TableRow_2_CELL_2).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 2 columna 3"),
                Ensure.that(dashboard.TableRow_2_CELL_3).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 2 columna 4"),
                Ensure.that(dashboard.TableRow_2_CELL_4).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 2 columna 5"),
                Ensure.that(dashboard.TableRow_2_CELL_5).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 3 columna 1"),
                Ensure.that(dashboard.TableRow_3_CELL_1).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 3 columna 2"),
                Ensure.that(dashboard.TableRow_3_CELL_2).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 3 columna 3"),
                Ensure.that(dashboard.TableRow_3_CELL_3).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 3 columna 4"),
                Ensure.that(dashboard.TableRow_3_CELL_4).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 3 columna 5"),
                Ensure.that(dashboard.TableRow_3_CELL_5).isDisplayed(),
                //AddATodoItem.called("prueba de visualizacion tabla fila 4 columna 1"),
                Ensure.that(dashboard.TableRow_4_CELL_1).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 4 columna 2"),
                Ensure.that(dashboard.TableRow_4_CELL_2).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 4 columna 3"),
                Ensure.that(dashboard.TableRow_4_CELL_3).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 4 columna 4"),
                Ensure.that(dashboard.TableRow_4_CELL_4).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 4 columna 5"),
                Ensure.that(dashboard.TableRow_4_CELL_5).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 5 columna 1"),
                Ensure.that(dashboard.TableRow_5_CELL_1).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 5 columna 2"),
                Ensure.that(dashboard.TableRow_5_CELL_2).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 5 columna 3"),
                Ensure.that(dashboard.TableRow_5_CELL_3).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 5 columna 4"),
                Ensure.that(dashboard.TableRow_5_CELL_4).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 5 columna 5"),
                Ensure.that(dashboard.TableRow_5_CELL_5).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 6 columna 1"),
                Ensure.that(dashboard.TableRow_6_CELL_1).isDisplayed(),
                //AddATodoItem.called("prueba de visualizacion tabla fila 6 columna 2"),
                Ensure.that(dashboard.TableRow_6_CELL_2).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 6 columna 3"),
                Ensure.that(dashboard.TableRow_6_CELL_3).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 6 columna 4"),
                Ensure.that(dashboard.TableRow_6_CELL_4).isDisplayed(),
                //AddATodoItem.called ("prueba de visualizacion tabla fila 6 columna 5"),
                Ensure.that(dashboard.TableRow_6_CELL_5).isDisplayed()
        );
    }

}
