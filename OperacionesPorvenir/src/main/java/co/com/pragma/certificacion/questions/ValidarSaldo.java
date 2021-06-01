package co.com.pragma.certificacion.questions;

import co.com.pragma.certificacion.userinterfaces.TransactionalPageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarSaldo implements Question<String> {

    public static ValidarSaldo inTheCanal (){
        return new ValidarSaldo ();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TransactionalPageElements.SALDO_FINAL).viewedBy(actor).asString();
    }
}
