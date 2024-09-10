package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ThreeFormRegister {

    public static Target NEXT_SECOND_PAGE =Target.the("Continue second page")
            .located(By.xpath("//*[@class='btn btn-blue pull-right']"));
}
