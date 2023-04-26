package co.com.AutScreenPlay.questions;

import co.com.AutScreenPlay.userinterfaces.PagiXYZ;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verify implements Question {

    public static Verify result() {
        return new Verify();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PagiXYZ.LBL_MENU).viewedBy(actor).asString();
    }
}