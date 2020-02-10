package starter.search;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Task;

public abstract class AddATodoItem implements Task {

    private final String thingToDo;

    protected AddATodoItem(String thingToDo) { this.thingToDo = thingToDo; }

    public static AddATodoItem called(String thingToDo) {
        return Instrumented.instanceOf(AddATodoItem.class).withProperties(thingToDo);
    }
}
