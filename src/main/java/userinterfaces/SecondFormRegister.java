package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SecondFormRegister {

    public static Target NEXT_SECOND =Target.the("Continue second page")
            .located(By.xpath("//*[@class='btn btn-blue']"));
}
