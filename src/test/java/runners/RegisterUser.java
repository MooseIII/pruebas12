package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_utest.feature",
glue = "StepDefinitions",
tags = "@Register",
snippets = SnippetType.CAMELCASE)
public class RegisterUser {
}
