package starter.search.repositorio.task

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.Task
import  net.serenitybdd.screenplay.actions.*

public class login_user_task implements Task {

    private final String username;
    private final String pass;

    public login_user_task(String pass,String username){
    this.username =username;
    this.pass=pass;
    }
    public static Performable login_user_app(String pass, String username){
       return instrumented(login_user_task.class,username,pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
actor.attemptsTo(
 ///////
       // WaitForWebElementCollection
        Enter.keyValues(username).into(starter.search.repositorio.model.login_user.txt_user),
        Enter.keyValues(username).into(starter.search.repositorio.model.login_user.txt_passwoard),
        Click.on(starter.search.repositorio.model.login_user.chk_remenber_seccion),
        Click.on(starter.search.repositorio.model.login_user.btn_login)

///////
);
    }

}
