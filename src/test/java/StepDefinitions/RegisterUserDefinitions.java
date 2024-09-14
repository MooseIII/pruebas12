package StepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegisterUserDefinitions {
    Actor user=new Actor("User");

    @Managed(driver="chrome")
    WebDriver driver;

    @Before
    public void config(){
        user.can(BrowseTheWeb.with(driver));
    }

    @Given("^Accedo a la pagina principal de orange$")
    public void accedoALaPaginaPrincipalDeOrange() {
        user.wasAbleTo(new OpenUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
    }

    @When("^completo la informacion del registro con el (.*)$")
    public void completoLaInformacionDelRegistro(String nombre) {
        user.attemptsTo(
              Login.firstFormRegister(nombre),
              FirstFormRegister.firstFormRegister(),
              SecondFormRegister.secondFormRegister(),
              ThreeFormRegister.threeFormRegister(),
              FourFormRegister.fourFormRegister(),
              FiveFormRegister.fiveFormRegister()
        );

    }
    @Then("^Valido que logre acceder al contenido de la pagina$")
    public void validoQueLogreAccederAlContenidoDeLaPagina() {

    }
}
