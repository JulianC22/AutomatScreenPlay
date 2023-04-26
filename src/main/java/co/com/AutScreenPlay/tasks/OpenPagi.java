package co.com.AutScreenPlay.tasks;

import co.com.AutScreenPlay.userinterfaces.PagiXYZ;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPagi implements Task {
    private PagiXYZ pagiXYZ;
    public static OpenPagi urlApp(){
        return Tasks.instrumented(OpenPagi.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pagiXYZ));
    }
}
