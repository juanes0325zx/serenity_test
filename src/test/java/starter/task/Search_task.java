package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.model.search;
import starter.search.SearchForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search_task{ //implements Task {

    private final String video;


    public Search_task(String pass,String video){
        this.video =video;
    }
    public static Performable search_one_video(String video){
      //  return instrumented(Search_task.class,video);
       return Task.where("{0} Searching on toutube #video",
                Click.on(search.txt_search),
                Enter.keyValues(video).into(search.txt_search),
                Click.on(search.btn_search)
        ).with("video").of(video);
    }
/*
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(search.txt_search),
                Enter.keyValues(video).into(search.txt_search),
                Click.on(search.btn_search)
        );
    }

    public static Performable test(String video) {
        return Task.where("{0} Searching on toutube #video",
                Click.on(search.txt_search),
                Enter.keyValues(video).into(search.txt_search),
                Click.on(search.btn_search)
        ).with("video").of(video);
    }
*/
}
