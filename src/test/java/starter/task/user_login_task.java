package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.model.login.login;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class user_login_task implements Task {

    private final String username;
    private final String pass;

    public user_login_task(String pass,String username){
        this.username =username;
        this.pass=pass;
    }
    public static Performable login_user_app(String pass, String username){
        return instrumented(user_login_task.class,pass,username);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.keyValues(username).into(login.txt_user),
                Enter.keyValues(pass).into(login.txt_passwoard),
              //  Click.on(login.chk_remenber_seccion),
                Click.on(login.btn_login)

        );
    }

}
