package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.ThreeFormRegister.PRESELECCION;

public class ThreeFormRegister implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRESELECCION)
        );
    }

    public static ThreeFormRegister threeFormRegister (){
        return new ThreeFormRegister();
    }
}
