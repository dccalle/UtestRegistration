package co.com.choucair.certification.UtestRegistration.tasks;

import co.com.choucair.certification.UtestRegistration.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.UtestRegistration.userinterface.LastStepPage.*;

public class FillOutSecurityData implements Task {

    private UtestData utestData;

    public FillOutSecurityData(UtestData utestData) {
        this.utestData = utestData;
    }

    public static FillOutSecurityData onLastStepPage(UtestData utestData) {
        return Tasks.instrumented(FillOutSecurityData.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PASSWORD_INPUT),
                Enter.theValue(utestData.getPassword()).into(PASSWORD_INPUT),
                Enter.theValue(utestData.getPassword()).into(PASSWORD_CONFIRM_INPUT),
                Click.on(STAY_INFORMED_CHECK),
                Click.on(TERMS_OF_USE_CHECK),
                Click.on(PRIVACY_SETTINGS_CHECK)
        );
    }
}
