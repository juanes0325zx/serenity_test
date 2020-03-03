package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.navigation.pages.*;

public class NavigateTo {

    public static Performable theDuckDuckGoHomePage() {
        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(test_page.class)
        );
    }

    public static Performable test_page2() {
        return Task.where("{0} ejemplo test",
                Open.browserOn().the(test_page2.class)
        );
    }

    public static Performable FacebbokHome() {
        return Task.where ("{0}  test facebook home",
                Open.browserOn ().the (facebook.class)
        );
    }


    public static Performable FacebookPublication() {
        return Task.where ("{0}  test facebook home",
                Open.browserOn ().the (publicion_facebook.class)
        );
    }
    public static Performable Mailboxt() {
        return Task.where("{0} login mail ",
                Open.browserOn().the(mailboxt.class)
        );
    }

}