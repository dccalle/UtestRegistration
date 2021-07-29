package co.com.choucair.certification.UtestRegistration.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StartRegistrationPage {
    public static final Target JOIN_TODAY_BUTTON = Target.the("Start registration").
            located(By.className("unauthenticated-nav-bar__sign-up"));

}
