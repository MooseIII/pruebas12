package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

public class FiveFormRegister {

    public static Target TITULO_ENTRE =Target.the("Titulo entrevista")
            .located(By.xpath("//label[text()='Interview Title']/following::input"));

    public static Target INTERVIWER =Target.the("Interviwer")
            .located(By.xpath("//input[@include-employees='onlyCurrent']"));

    public static Target DATE_INTERVIEW =Target.the("Date Interviwer")
            .located(By.xpath("//input[@placeholder='yyyy-dd-mm']"));

    public static Target SAVE =Target.the("SAVE")
            .located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));

    public static Target PASSED =Target.the("Passed Interviwer")
            .located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--success']"));

    public static Target SAVE2 =Target.the("Passed Interviwer 2")
            .located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));

    public static Target OFFERJOB =Target.the("OfferJob")
            .located(By.xpath("//*[text()=' Offer Job ']"));

    public static Target OFFERJOB_SAVE =Target.the("OfferJobSave")
            .located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));

    public static Target HIRE =Target.the("OfferJob")
            .located(By.xpath("//*[text()=' Hire ']"));

    public static Target HIRE_SAVE =Target.the("OfferJob")
            .located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));


    public static String USER_NAME = "//div[contains(text(),'replace')]/following::div[contains(text(),'Hired')]";

    public static Target CANDIDATO =Target.the("Candidato")
            .located(By.xpath("//a[contains(text(), 'Candidates')]"));



}
