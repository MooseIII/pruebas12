package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static Target USUARIO=Target.the("Nombre Usuario")
            .located(By.name("username"));

    public static Target PASSWORD=Target.the("Password")
            .located(By.name("password"));

    public static Target LOGIN=Target.the("Login")
            .located(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));




}
