package starter.model.dashBoard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.model.dashBoard.dashboard;

public class OverViewData {

    public static Question<String> credit_avaliable(){
        return actor -> TextContent.of (dashboard.CREDIT_AVALIABLE).viewedBy(actor).asString().trim();
    }
    public static Question<String> total_balance(){
        return actor -> TextContent.of (dashboard.TOTAL_BALANCE).viewedBy(actor).asString().trim();
    }
}
