package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FinalFormRegister {
    public static Target PASSWORD=Target.the("Password_user")
            .located(By.id("password"));

    public static Target RE_PASSWORD=Target.the("RE_Password_user")
            .located(By.id("confirmPassword"));

    public static Target CHECK_TERM=Target.the("Check_term")
            .located(By.xpath("//*[@ng-class='{error: userForm.termOfUse.$error.required}']"));

    public static Target CHECK_POLICY=Target.the("Check_polycy")
            .located(By.xpath("//*[@ng-class='{error: userForm.privacySetting.$error.required}']"));

    public static Target FINISH=Target.the("Finish_Form")
            .located(By.xpath("//*[@class='btn btn-blue']"));
}
