package starter.model.menu;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.model.dashBoard.dashboard;

public class OverViewData {

    public static Question<String> credit_avaliable() {
        return actor -> TextContent.of (dashboard.CREDIT_AVALIABLE).viewedBy (actor).asString ().trim ();
    }


}