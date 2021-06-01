package co.com.pragma.certificacion.tasks;

import co.com.pragma.certificacion.userinterfaces.TransactionalPageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarSaldo implements Task {

    public static ConsultarSaldo inTheCanal(){
        return instrumented(ConsultarSaldo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TransactionalPageElements.SECCION_CONSULTA),
        Click.on(TransactionalPageElements.BOTON_CONSULTAR_SALDO));
    }
}
