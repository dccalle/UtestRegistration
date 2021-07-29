package co.com.choucair.certification.UtestRegistration.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalDataPage {
    public static final Target  FIRST_NAME_INPUT =
            Target.the("Write first name").located(By.id("firstName"));
    public static final Target  LAST_NAME_INPUT =
            Target.the("Write last name").located(By.id("lastName"));
    public static final Target  EMAIL_INPUT =
            Target.the("Write email").located(By.id("email"));
    public static final Target  BIRTH_MONTH_SELECT =
            Target.the("Select birth month").located(By.id("birthMonth"));
    public static final Target  BIRTH_DAY_SELECT =
            Target.the("Select birth day").located(By.id("birthDay"));
    public static final Target  BIRTH_YEAR_SELECT =
            Target.the("Select birth year").located(By.id("birthYear"));
    public static final Target  LANGUAGE_INPUT =
            Target.the("Select your languages").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target  LOCATION_BUTTON =
            Target.the("Show location form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
