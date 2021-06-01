package co.com.pragma.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransactionalPageElements {

    public static final Target SECCION_CONSULTA = Target.the("seccion de consultas").located(By.id("ctl00_m_g_d7322bce_5198_469b_bcaf_85a1808655a6_ctl00_liSaldos"));
    public static final Target BOTON_CONSULTAR_SALDO =Target.the("boton consultar saldo").locatedBy("//li[@id='ctl00_m_g_d7322bce_5198_469b_bcaf_85a1808655a6_ctl00_liSaldos']//a[contains(text(),'Saldo de mi cuenta')]");
    public static final Target SALDO_FINAL = Target.the("Saldo final").locatedBy("(//table[@class='tablarentabilidadcuentaPV']//td)[14]");

}
