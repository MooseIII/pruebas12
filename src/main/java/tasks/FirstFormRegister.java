package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.HomePage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.FirstFromRegistrer.*;
import static utils.CompletarCampo.imprimir;

public class FirstFormRegister implements Task {
    private String name="";
    public FirstFormRegister(String name) {
       this.name=name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.JOIN),
                SendKeys.of("Alisson").into(USER_NAME),
                SendKeys.of("Bohorquez").into(LAST_NAME),
                SendKeys.of("Alisson123@HOTMAIL.COM").into(EMAIL),
                SendKeys.of("November").into(BIRTH_MONTH),
                SendKeys.of("20").into(BIRTH_DAY),
                SendKeys.of("1999").into(BIRTH_YEAR),
                Click.on(NEXT)
                );
    }

  public static FirstFormRegister firstFormRegister(String nombre){
   imprimir(nombre);
     return Tasks.instrumented(FirstFormRegister.class,nombre);
  }
}
