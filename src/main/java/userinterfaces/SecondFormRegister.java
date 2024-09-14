package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class SecondFormRegister {

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
            .located(By.xpath("//label[normalize-space(text())='Email']/following::input[1]"));

    public static Target CONTAC_NUMBER =Target.the("Numero de contacto")
            .located(By.xpath("//label[normalize-space(text())='Contact Number']/following::input[1]"));

    public static Target RESUME =Target.the("Carga de Archivo")
            .located(By.xpath("//input[@type='file']"));

    public static Target KEYWORDS =Target.the("Keywords")
            .located(By.xpath("//*[@placeholder='Enter comma seperated words...']"));

    public static Target DATEAPLI =Target.the("Fecha de aplicacion")
            .located(By.xpath("//input[contains(@placeholder, 'dd-mm')]"));

    public static Target NOTES =Target.the("NOtes")
            .located(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']"));

    public static Target CHECKBOX =Target.the("Checkbox")
            .located(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));


    public static Target SIGUIENTE =Target.the("Guardar")
            .located(By.xpath("//button[@type='submit']"));




}
