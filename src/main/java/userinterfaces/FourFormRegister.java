package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FourFormRegister {

    public static Target AGENDAR =Target.the("Agendar entrevista")
            .located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));

    public static Target AGENDAR_1 =Target.the("Agendar entrevista_1")
            .located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']"));
}
