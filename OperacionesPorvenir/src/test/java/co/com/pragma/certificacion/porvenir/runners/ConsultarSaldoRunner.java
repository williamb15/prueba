package co.com.pragma.certificacion.porvenir.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/consultar_saldo.feature",
        glue = "co.com.pragma.certificacion.porvenir.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class ConsultarSaldoRunner {
}
