package starter.task.facebook;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.model.login.login;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class createNewUser implements Task {

    private  String username;
    private  String pass;
    private boolean value;

    public createNewUser(String pass, String username, boolean value){
        this.username =username;
        this.pass=pass;
        this.value=value;
    }

    public static login_with with(){
     return new login_with();
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.keyValues(username).into(login.txt_user),
                Enter.keyValues(pass).into(login.txt_passwoard)
        );
    if (value){
        actor.attemptsTo(
        WaitUntil.the (login.chk_remenber_seccion,isVisible()).forNoMoreThan(10).seconds(),
        Click.on(login.chk_remenber_seccion));
     }
        actor.attemptsTo(
        WaitUntil.the (login.btn_login,isVisible()).forNoMoreThan(10).seconds(),
        Click.on(login.btn_login));
    }

public static class login_with{
    private  String username;
    private  String pass;

    public login_with username(String username){
        this.username=username;
        return this;
    }

    public login_with pass(String pass){
        this.pass=pass;
        return this;
    }
public Performable sendData(boolean value){
        return new createNewUser (pass ,username,value);
}

}
}
