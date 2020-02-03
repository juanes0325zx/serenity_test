package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

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
}