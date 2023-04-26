package co.com.AutScreenPlay.tasks;

import co.com.AutScreenPlay.userinterfaces.PagiXYZ;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class LogIn implements Task {
    static String user;
    static String pass;
    public static LogIn credentials(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        List<List<String>> rowsNoHeader = rows.subList(1, rows.size());
        for (List<String> row : rowsNoHeader) {
            user = row.get(0);
            pass = row.get(1);
            System.out.println("    User: " + user + "    Password: " + pass);
        }
        return Tasks.instrumented(LogIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(user).into(PagiXYZ.TXT_USER),
                         Enter.theValue(pass).into(PagiXYZ.TXT_PASS),
                         Click.on(PagiXYZ.BTN_SING_IN));
    }
}