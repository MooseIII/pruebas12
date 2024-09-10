package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static userinterfaces.ThreeFormRegister.NEXT_SECOND_PAGE;

public class ThreeFormRegister implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NEXT_SECOND_PAGE));

    }
    public static ThreeFormRegister threeFormRegister (){
     return new ThreeFormRegister();
    }
}


