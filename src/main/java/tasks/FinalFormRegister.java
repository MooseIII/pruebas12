package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static userinterfaces.FinalFormRegister.*;

public class FinalFormRegister implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Colombia2024*").into(PASSWORD),
                SendKeys.of("Colombia2024*").into(RE_PASSWORD),
                Click.on(CHECK_TERM),
                Click.on(CHECK_POLICY),
                Click.on(FINISH)
        );

    }
    public static FinalFormRegister finalFormRegister () {
        return new FinalFormRegister();

    }
}
