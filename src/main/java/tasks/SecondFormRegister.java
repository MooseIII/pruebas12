package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;


import static userinterfaces.SecondFormRegister.*;

public class SecondFormRegister implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Andres").into(FIRST_NAME),
                SendKeys.of("Javier").into(MIDDLE_NAME),
                SendKeys.of("Sanchez Barrera").into(LAST_NAME),
                Click.on(VACANCI),
                Click.on(VACANCI_1),
                SendKeys.of("prueba@prueba.com").into(EMAIL),
                SendKeys.of("1234567").into(CONTAC_NUMBER),
                SendKeys.of("C:\\Users\\Administrador\\IdeaProjects\\Proyectos\\PatronScreenplay\\Archivos")
                        .into(RESUME),
                SendKeys.of("Pruebas Automatización Orange").into(KEYWORDS),
             //   SendKeys.of("2024-13-09").into(DATEAPLI),
                SendKeys.of("Pruebas Orange ingreso").into(NOTES),
                Click.on(CHECKBOX),
                Click.on(SIGUIENTE)
        );
    }
    public static SecondFormRegister secondFormRegister (){

        return new SecondFormRegister();
    }
}
