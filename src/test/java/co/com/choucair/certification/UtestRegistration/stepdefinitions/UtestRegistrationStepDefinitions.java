package co.com.choucair.certification.UtestRegistration.stepdefinitions;

import co.com.choucair.certification.UtestRegistration.model.UtestData;
import co.com.choucair.certification.UtestRegistration.questions.Answer;
import co.com.choucair.certification.UtestRegistration.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import static co.com.choucair.certification.UtestRegistration.util.Constant.*;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestRegistrationStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Given("^as Catalina wants to create an account at Utest$")
    public void asCatalinaWantsToCreateAnAccountAtUtest() throws Exception {
        theActorCalled("Catalina").wasAbleTo(OpenUp.theUtestPage());
    }

    @When("^She fills out the register form$")
    public void sheFillsOutTheRegisterForm(List<UtestData> utestData) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                StartRegistration.withJoinTodayButton(),
                FillOutPersonalData.onPersonalDataPage(utestData.get(ZERO)),
                FillOutLocationData.onLocationPage(utestData.get(ZERO)),
                FillOutDevicesData.onDevicesPage(utestData.get(ZERO)),
                FillOutSecurityData.onLastStepPage(utestData.get(ZERO))
        );
    }

    @Then("^She validates a label on last page$")
    public void sheValidatesALabelOnLastPage(List<UtestData> utestData) throws Exception {
        theActorInTheSpotlight().should(seeThat(Answer.toLastStep(utestData.get(ZERO))));
    }

}
