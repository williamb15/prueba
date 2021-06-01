package co.com.pragma.certificacion.tasks;

import co.com.pragma.certificacion.models.User;
import co.com.pragma.certificacion.userinterfaces.HomePageElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private User loginData;

    public Login(User loginData) {
        this.loginData = loginData;
    }

    public static Login inTheSite(User loginData) {
        return instrumented(Login.class, loginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageElements.BOTON_OMITIR_PASO),
                Click.on(HomePageElements.BOTON_CERRAR_POPUP),
                Click.on(HomePageElements.BOTON_INGRESAR_CUENTA_PERSONAL),
                Click.on(HomePageElements.BOTON_SOY_AFILIADO),
                Enter.theValue(loginData.getUsername()).into(HomePageElements.CAMPO_USUARIO),
                Enter.theValue(loginData.getPassword()).into(HomePageElements.CAMPO_CONTRASEÑA),
                Click.on(HomePageElements.BOTON_INGRESAR));
    }
}
