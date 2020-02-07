package starter.model.menu;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.model.dashBoard.dashboard;

public class OverViewData_menu {

    public static Question<String> CREDIT_CARDS() {
        return actor -> TextContent.of (menu.CREDIT_CARDS).viewedBy (actor).asString ().trim ();
    }
    public static Question<String> DEBIT_CARDS() {
        return actor -> TextContent.of (menu.DEBIT_CARDS).viewedBy (actor).asString ().trim ();
    }
    public static Question<String> LENDING() {
        return actor -> TextContent.of (menu.LENDING).viewedBy (actor).asString ().trim ();
    }
    public static Question<String> LOANS() {
        return actor -> TextContent.of (menu.LOANS).viewedBy (actor).asString ().trim ();
    }
    public static Question<String> MORTAGAGES() {
        return actor -> TextContent.of (menu.MORTAGAGES).viewedBy (actor).asString ().trim ();
    }
}