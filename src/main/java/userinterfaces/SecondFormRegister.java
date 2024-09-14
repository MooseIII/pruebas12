package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SecondFromRegister {

    public static Target FIRST_NAME =Target.the("Primer nombre")
            .located(By.name("firstName"));

    public static Target MIDDLE_NAME =Target.the("Segundo nombre")
            .located(By.name("middleName"));

    public static Target LAST_NAME =Target.the("Apellido")
            .located(By.name("lastName"));

   public static Target VACANCI =Target.the("Lista desplegable")
            .located(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));

    public static Target VACANCI_1 =Target.the("Seleccio de rol")
            .located(By.xpath("//span[contains(text(), 'Payroll Administrator')]"));

    public static Target EMAIL =Target.the("Correo")
            .located(By.xpath("//label[text()='Email:']/following-sibling::input"));
}
