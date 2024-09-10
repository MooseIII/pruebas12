package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FirstFromRegistrer {

    public static Target USER_NAME=Target.the("user name")
            .located(By.id("firstName"));

    public static Target LAST_NAME=Target.the("user last name")
            .located(By.id("lastName"));

    public static Target EMAIL=Target.the("user email")
            .located(By.id("email"));

    public static Target BIRTH_MONTH=Target.the("birth month")
            .located(By.id("birthMonth"));

    public static Target BIRTH_DAY=Target.the("birth day")
            .located(By.id("birthDay"));

    public static Target BIRTH_YEAR=Target.the("birth year")
            .located(By.id("birthYear"));

    public static Target NEXT=Target.the("Continue second form")
            .located(By.xpath("//*[@class='material-icons']"));
}
