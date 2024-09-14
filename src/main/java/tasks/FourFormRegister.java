package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.FourFormRegister.AGENDAR;
import static userinterfaces.FourFormRegister.AGENDAR_1;


public class FourFormRegister implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AGENDAR),
                Click.on(AGENDAR_1));
    }
    public static FourFormRegister fourFormRegister(){
        return new FourFormRegister();
    }
}
