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
import questions.VerificarLabel;
import tasks.FinalFormRegister;
import tasks.FirstFormRegister;
import tasks.SecondFormRegister;
import tasks.ThreeFormRegister;

import java.util.function.Predicate;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static utils.CompletarCampo.imprimir;

public class RegisterUserDefinitions {
    Actor user=new Actor("User");

    @Managed(driver="chrome")
    WebDriver driver;

    @Before
    public void config(){
        user.can(BrowseTheWeb.with(driver));
    }

    @Given("^Accedo a la pagina principal de Utest\\.com$")
    public void accedoALaPaginaPrincipalDeUtestCom() {
        user.wasAbleTo(new OpenUrl("https://www.utest.com/"));
    }

    @When("^completo la informacion del registro con el (.*)$")
    public void completoLaInformacionDelRegistro(String nombre) {
        user.attemptsTo(FirstFormRegister.firstFormRegister(nombre),
              SecondFormRegister.secondFormRegister(),
                ThreeFormRegister.threeFormRegister(),
                FinalFormRegister.finalFormRegister()

        );

    }
    @Then("^Valido que logre acceder al contenido de la pagina$")
    public void validoQueLogreAccederAlContenidoDeLaPagina() {
        user.should(seeThat( VerificarLabel.verificarLabel(), Predicate.isEqual("Last name:")));
    }
}
