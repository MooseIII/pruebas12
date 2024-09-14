package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static userinterfaces.FirstFormRegistrer.ADD;
import static userinterfaces.FirstFormRegistrer.RECRUITMENT;


public class FirstFormRegister implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RECRUITMENT),
                Click.on(ADD));
    }
    public static FirstFormRegister firstFormRegister (){

        return new FirstFormRegister();
    }
}
