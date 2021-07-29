package co.com.choucair.certification.UtestRegistration.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage {
    public static final Target COMPUTER_OS_SELECT =
            Target.the("Select Computer OS ").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_OS_INPUT =
            Target.the("Write Computer OS ").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target COMPUTER_OS_VERSION_SELECT =
            Target.the("Select Computer OS Version ").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_OS_VERSION_INPUT =
            Target.the("Write Computer OS Version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target COMPUTER_OS_LANGUAGE_SELECT =
            Target.the("Select Computer OS Language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_OS_LANGUAGE_INPUT =
            Target.the("Write Computer OS Language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target MOBILE_BRAND_SELECT =
            Target.the("Select Mobile Brand ").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_BRAND_INPUT =
            Target.the("Write Computer OS ").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target MOBILE_MODEL_SELECT =
            Target.the("Select Mobile Model ").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_MODEL_INPUT =
            Target.the("Write Mobile Model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target MOBILE_OS_SELECT =
            Target.the("Select Mobile OS").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target MOBILE_OS_INPUT =
            Target.the("Write Mobile OS").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target LAST_STEP_BUTTON =
            Target.the("Show last step form").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
