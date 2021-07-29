package co.com.choucair.certification.UtestRegistration.questions;

import co.com.choucair.certification.UtestRegistration.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.UtestRegistration.userinterface.LastStepPage.*;

public class Answer implements Question<Boolean> {
    private UtestData utestData;

    public Answer(UtestData utestData) {
        this.utestData = utestData;
    }

    public static Answer toLastStep(UtestData utestData) {
        return new Answer(utestData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String lastStepLabel = Text.of(LAST_STEP_LABEL).viewedBy(actor).asString();
        return utestData.getLastStepLabel().equals(lastStepLabel);
    }
}
