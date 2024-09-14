package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.rmi.CORBA.Util;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.findAll;
import static org.junit.Assert.assertTrue;
import static userinterfaces.FiveFormRegister.*;



public class FiveFormRegister implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        actor.attemptsTo(
             Click.on(TITULO_ENTRE),
             SendKeys.of("Exitoso").into(TITULO_ENTRE),
             SendKeys.of("he").into(INTERVIWER));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
             SendKeys.of(Keys.ARROW_DOWN,Keys.ENTER).into(INTERVIWER),
             SendKeys.of("2024-13-09").into(DATE_INTERVIEW),
             Click.on(SAVE),
             Click.on(PASSED),
             Click.on(SAVE2),
             Click.on(OFFERJOB),
             Click.on(OFFERJOB_SAVE),
             Click.on(HIRE),
             Click.on(HIRE_SAVE),
             Click.on(CANDIDATO)


        );

        String xpath= utils.CompletarCampo.xphatDinamico(USER_NAME,"Andres Javier Sanchez Barrera");


        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } WebElement elemento = driver.findElement(By.xpath(xpath));
        assertTrue("El elemento no es visible", elemento.isDisplayed());
    }

    public static FiveFormRegister fiveFormRegister(){
        return new FiveFormRegister();
    }
}
