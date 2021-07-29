package co.com.choucair.certification.UtestRegistration.tasks;

import co.com.choucair.certification.UtestRegistration.userinterface.StartRegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.UtestRegistration.userinterface.StartRegistrationPage.*;

public class StartRegistration implements Task {
    public static StartRegistration withJoinTodayButton() {
        return Tasks.instrumented(StartRegistration.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JOIN_TODAY_BUTTON));
    }
}
