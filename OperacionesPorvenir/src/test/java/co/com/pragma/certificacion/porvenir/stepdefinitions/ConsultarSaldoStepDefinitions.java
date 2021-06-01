package co.com.pragma.certificacion.porvenir.stepdefinitions;

import co.com.pragma.certificacion.exceptions.ConsultarSaldoException;
import co.com.pragma.certificacion.models.User;
import co.com.pragma.certificacion.questions.ValidarSaldo;
import co.com.pragma.certificacion.tasks.ConsultarSaldo;
import co.com.pragma.certificacion.tasks.Login;
import co.com.pragma.certificacion.utils.GeneralConstants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class ConsultarSaldoStepDefinitions extends GeneralStepDefinitions {

    @Before
    public void config() {
        SetUp();
    }

    @Given("^el usuario se autentica en el canal$")
    public void elUsuarioSeAutenticaEnElCanal(List<User> data) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Login.inTheSite(data.get(0)));
    }

    @When("^el usuario consulta el saldo$")
    public void elUsuarioConsultaElSaldo() {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultarSaldo.inTheCanal());
    }

    @Then("^el podra ver su saldo disponible (.*)$")
    public void elPodraVerSuSaldoDisponible(String saldo) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarSaldo.inTheCanal(),
                Matchers.equalTo(saldo)).orComplainWith(ConsultarSaldoException.class, GeneralConstants.MENSAJE_ERROR));

    }
}
