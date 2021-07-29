package co.com.choucair.certification.UtestRegistration.tasks;

import co.com.choucair.certification.UtestRegistration.model.UtestData;
import co.com.choucair.certification.UtestRegistration.userinterface.PersonalDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import static co.com.choucair.certification.UtestRegistration.userinterface.PersonalDataPage.*;

public class FillOutPersonalData implements Task {

    private UtestData utestData;

    public FillOutPersonalData(UtestData utestData) {
        this.utestData = utestData;
    }

    public static FillOutPersonalData onPersonalDataPage(UtestData utestData) {
        return Tasks.instrumented(FillOutPersonalData.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestData.getFirstName()).into(FIRST_NAME_INPUT),
                Enter.theValue(utestData.getLastName()).into(LAST_NAME_INPUT),
                Enter.theValue(utestData.getEmail()).into(EMAIL_INPUT),
                SelectFromOptions.byVisibleText(utestData.getBirthMonth().trim()).from(BIRTH_MONTH_SELECT),
                SelectFromOptions.byVisibleText(utestData.getBirthDay().trim()).from(BIRTH_DAY_SELECT),
                SelectFromOptions.byVisibleText(utestData.getBirthYear().trim()).from(BIRTH_YEAR_SELECT),
                Enter.theValue(utestData.getLanguage()).into(LANGUAGE_INPUT),
                Click.on(LOCATION_BUTTON)
        );
    }
}
