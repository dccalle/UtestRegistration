package co.com.choucair.certification.UtestRegistration.tasks;

import co.com.choucair.certification.UtestRegistration.model.UtestData;
import co.com.choucair.certification.UtestRegistration.userinterface.LocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.UtestRegistration.userinterface.LocationPage.*;

public class FillOutLocationData implements Task {
    private UtestData utestData;

    public FillOutLocationData(UtestData utestData) {
        this.utestData = utestData;
    }

    public static FillOutLocationData onLocationPage(UtestData utestData) {
        return Tasks.instrumented(FillOutLocationData.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CITY_INPUT),
                Enter.theValue(utestData.getCity()).into(CITY_INPUT),
                Hit.the(Keys.DOWN).into(CITY_INPUT),
                Hit.the(Keys.ENTER).into(CITY_INPUT),
                Enter.theValue(utestData.getZip()).into(ZIP_INPUT),
                Click.on(COUNTRY_SELECT),
                Enter.theValue(utestData.getCountry()).into(COUNTRY_INPUT),
                Hit.the(Keys.ENTER).into(COUNTRY_INPUT),
                Click.on(DEVICE_BUTTON)
        );

    }
}
