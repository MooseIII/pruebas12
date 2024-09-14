package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static userinterfaces.Login.*;


public class Login implements Task {
    private String name="";
    public Login(String name) {
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

  public static Login firstFormRegister(String nombre){

     return Tasks.instrumented(Login.class,nombre);
  }
}
