package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable search_vidio_on_youtube() {
        return Task.where("{0} Searching on toutube",
                Open.browserOn().the(URL.class)
        );
    }
}