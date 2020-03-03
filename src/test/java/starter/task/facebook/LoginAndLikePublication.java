package starter.task.facebook;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.model.facebook_publiction.facebook_login_logout;
import starter.model.facebook_publiction.facebook_register;
import starter.model.facebook_publiction.toolbar_facebook_publication;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginAndLikePublication implements Task {

    private  String email;
    private String pass;
    private String url;
    private boolean value;

    public LoginAndLikePublication(String email, String pass, String url, boolean value){
        this.email =email;
        this.pass =pass;
        this.url=url;
        this.value=value;
    }

    public static LoginAndLike with(){
     return new LoginAndLike();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo (
                WaitUntil.the (facebook_login_logout.txt_user_login, isVisible ()).forNoMoreThan (10).seconds (),
                Enter.keyValues (email).into (facebook_login_logout.txt_user_login),
                WaitUntil.the (facebook_login_logout.txt_user_pass, isVisible ()).forNoMoreThan (10).seconds (),
                Enter.keyValues (pass).into (facebook_login_logout.txt_user_pass),
                Click.on (facebook_login_logout.btn_login)

        );
        if (value) {
            actor.attemptsTo (
                    WaitUntil.the (toolbar_facebook_publication.like_btn, isVisible ()).forNoMoreThan (10).seconds (),
                    Click.on (toolbar_facebook_publication.like_btn)
            );
        }

    }
public static class LoginAndLike{
    private  String email;
    private String pass;
    private String url;



    public LoginAndLike mailLogin(String email){
        this.email=email;
        return this;
    }

    public LoginAndLike passLogin(String pass){
        this.pass=pass;
        return this;
    }


    public LoginAndLike urlLogin(String phone){
        this.url=url;
        return this;
    }
public Performable sendData(boolean value){
        return new LoginAndLikePublication (email,pass,url,value);
}
}
}
