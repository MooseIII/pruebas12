package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ThreeFormRegister {

    public static Target PRESELECCION =Target.the("Preseleccion")
            .located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']"));


}
