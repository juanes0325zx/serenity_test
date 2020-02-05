package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.model.dashBoard.dashboard;

public class CreditAvaliable implements Question<String> {

    public static Question<String> value(){
     return  new CreditAvaliable();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(dashboard.CREDIT_AVALIABLE).getText();
    }
}
