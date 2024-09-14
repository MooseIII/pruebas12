package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FirstFromRegistrer  {

    public static Target RECRUITMENT =Target.the("Recruitment")
            .located(By.xpath("//*[@href='/web/index.php/recruitment/viewRecruitmentModule']"));

    public static Target ADD =Target.the("Agregar contrato")
            .located(By.xpath("//*[@class='oxd-icon bi-plus oxd-button-icon']"));

}
