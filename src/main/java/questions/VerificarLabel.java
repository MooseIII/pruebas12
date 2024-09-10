package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.FirstFromRegistrer.LAST_NAME;


public class VerificarLabel {

    public static Question<String> verificarLabel() {
        return actor -> Text.of(LAST_NAME).viewedBy(actor).asString();
    }

}
