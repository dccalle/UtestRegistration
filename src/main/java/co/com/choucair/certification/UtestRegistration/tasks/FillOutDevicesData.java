package co.com.choucair.certification.UtestRegistration.tasks;

import co.com.choucair.certification.UtestRegistration.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.UtestRegistration.userinterface.DevicesPage.*;

public class FillOutDevicesData implements Task {
    private UtestData utestData;

    public FillOutDevicesData(UtestData utestData) {
        this.utestData = utestData;
    }

    public static FillOutDevicesData onDevicesPage(UtestData utestData) {
        return Tasks.instrumented(FillOutDevicesData.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPUTER_OS_SELECT),
                Enter.theValue(utestData.getComputerOS()).into(COMPUTER_OS_INPUT),
                Hit.the(Keys.ENTER).into(COMPUTER_OS_INPUT),
                Click.on(COMPUTER_OS_VERSION_SELECT),
                Enter.theValue(utestData.getComputerOSVersion()).into(COMPUTER_OS_VERSION_INPUT),
                Hit.the(Keys.ENTER).into(COMPUTER_OS_VERSION_INPUT),
                Click.on(COMPUTER_OS_LANGUAGE_SELECT),
                Enter.theValue(utestData.getComputerOSLanguage()).into(COMPUTER_OS_LANGUAGE_INPUT),
                Hit.the(Keys.ENTER).into(COMPUTER_OS_LANGUAGE_INPUT),
                Click.on(MOBILE_BRAND_SELECT),
                Enter.theValue(utestData.getMobileBrand()).into(MOBILE_BRAND_INPUT),
                Hit.the(Keys.ENTER).into(MOBILE_BRAND_INPUT),
                Click.on(MOBILE_MODEL_SELECT),
                Enter.theValue(utestData.getMobileModel()).into(MOBILE_MODEL_INPUT),
                Hit.the(Keys.ENTER).into(MOBILE_MODEL_INPUT),
                Click.on(MOBILE_OS_SELECT),
                Enter.theValue(utestData.getMobileOS()).into(MOBILE_OS_INPUT),
                Hit.the(Keys.ENTER).into(MOBILE_OS_INPUT),
                Click.on(LAST_STEP_BUTTON)
        );
    }
}
