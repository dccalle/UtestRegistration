package co.com.choucair.certification.UtestRegistration.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastStepPage {
    public static final Target PASSWORD_INPUT =
            Target.the("Write your password").located(By.id("password"));
    public static final Target PASSWORD_CONFIRM_INPUT =
            Target.the("Confirm your password").located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED_CHECK =
            Target.the("Stay informed check").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/input"));
    public static final Target TERMS_OF_USE_CHECK =
            Target.the("Stay informed check").located(By.id("termOfUse"));
    public static final Target PRIVACY_SETTINGS_CHECK =
            Target.the("Stay informed check").located(By.id("privacySetting"));
    public static final Target LAST_STEP_LABEL =
            Target.the("Last step label").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[2]"));

}
