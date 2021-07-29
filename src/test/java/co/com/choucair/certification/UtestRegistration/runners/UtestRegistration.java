package co.com.choucair.certification.UtestRegistration.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/UtestRegistration.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.UtestRegistration.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class UtestRegistration {
}
