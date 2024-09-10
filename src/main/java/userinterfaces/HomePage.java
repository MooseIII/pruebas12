package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static Target JOIN=Target.the("Boton Join")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
