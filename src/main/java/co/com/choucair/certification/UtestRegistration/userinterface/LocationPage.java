package co.com.choucair.certification.UtestRegistration.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {
    public static final Target CITY_INPUT =
            Target.the("Select city").located(By.id("city"));
    public static final Target ZIP_INPUT =
            Target.the("Write PostCode/Zip").located(By.id("zip"));
    public static final Target COUNTRY_SELECT =
            Target.the("Select Country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target COUNTRY_INPUT =
            Target.the("Write Country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target DEVICE_BUTTON =
            Target.the("Write Country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
