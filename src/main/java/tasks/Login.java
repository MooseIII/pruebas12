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
import static userinterfaces.HomePage.*;
import static utils.CompletarCampo.imprimir;

public class FirstFormRegister implements Task {
    private String name="";
    public FirstFormRegister(String name) {
       this.name=name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Admin").into(USUARIO),
                SendKeys.of("admin123").into(PASSWORD),
                Click.on(LOGIN)
                );
    }

  public static FirstFormRegister firstFormRegister(String nombre){
   imprimir(nombre);
     return Tasks.instrumented(FirstFormRegister.class,nombre);
  }
}
