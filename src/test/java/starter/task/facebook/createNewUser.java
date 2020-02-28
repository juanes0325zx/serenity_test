package starter.task.facebook;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.model.facebook_publiction.facebook_register;
import starter.model.login.login;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class createNewUser implements Task {

    private  String mail;
    private String pass;
    private String name;
    private String lastname;
    private String phone;
    private boolean value;

    public createNewUser(String mail, String pass,String name,String lastname,String phone, boolean value){
        this.mail =mail;
        this.pass =pass;
        this.name =name;
        this.lastname =lastname;
        this.phone=phone;
        this.value=value;
    }

    public static createNew with(){
     return new createNew();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo (
                WaitUntil.the (facebook_register.txt_name, isVisible ()).forNoMoreThan (10).seconds (),
                Enter.keyValues (name).into (facebook_register.txt_name),
                WaitUntil.the (facebook_register.txt_lastname, isVisible ()).forNoMoreThan (10).seconds (),
                Enter.keyValues (lastname).into (facebook_register.txt_lastname),
                WaitUntil.the (facebook_register.txt_passwoard, isVisible ()).forNoMoreThan (10).seconds (),
                Enter.keyValues (pass).into (facebook_register.txt_passwoard),
                Click.on (facebook_register.btn_sex_male),
                WaitUntil.the (facebook_register.txt_mail_phone, isVisible ()).forNoMoreThan (10).seconds (),
                Enter.keyValues (mail).into (facebook_register.txt_mail_phone),
                WaitUntil.the (facebook_register.txt_mail_confirm, isVisible ()).forNoMoreThan (10).seconds (),
                Enter.keyValues (mail).into (facebook_register.txt_mail_confirm),
                Click.on (facebook_register.selector_year),
                WaitUntil.the (facebook_register.selector_year_option_1994, isVisible ()).forNoMoreThan (10).seconds (),
                Click.on (facebook_register.selector_year_option_1994)


        );
        if (value) {
            actor.attemptsTo (
                    WaitUntil.the (facebook_register.btn_register, isVisible ()).forNoMoreThan (10).seconds (),
                    Click.on (facebook_register.btn_register));

        }

    }
public static class createNew{
    private  String mail;
    private String pass;
    private String name;
    private String lastname;
    private String phone;


    public createNew mail(String mail){
        this.mail=mail;
        return this;
    }

    public createNew pass(String pass){
        this.pass=pass;
        return this;
    }

    public createNew name(String name){
        this.name=name;
        return this;
    }
    public createNew lastname(String lastname){
        this.lastname=lastname;
        return this;
    }

    public createNew phone(String phone){
        this.phone=phone;
        return this;
    }
public Performable sendData(boolean value){
        return new createNewUser(mail,pass,name,lastname,phone,value);
}
}
}
