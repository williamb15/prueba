package co.com.pragma.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageElements {

    public static final Target BOTON_OMITIR_PASO = Target.the("Boton omitir paso").located(By.id("no-momento"));
    public static final Target BOTON_CERRAR_POPUP = Target.the("Boton cerrar pop up").locatedBy("//div[@id='modal-general1']//button[@class='close']");
    public static final Target BOTON_INGRESAR_CUENTA_PERSONAL = Target.the("Boton ingresar a cuenta personal").locatedBy("//div[@class='menuPorvenir sin-perfilar']//a[@class='dropdown-toggle cuenta-personal']");
    public static final Target BOTON_SOY_AFILIADO = Target.the("Boton afiliado").locatedBy("//div[@class='menuPorvenir sin-perfilar']//li[@class='ocultar']//a[@id='linkAfl']");
    public static final Target CAMPO_USUARIO = Target.the("Campo usuario").located(By.id("ctl00_m_g_2cbc234e_582a_4a65_ad96_bc55b5730f80_ctl00_txtUserName"));
    public static final Target CAMPO_CONTRASEÑA = Target.the("Campo contraseña").located(By.id("ctl00_m_g_2cbc234e_582a_4a65_ad96_bc55b5730f80_ctl00_txtPassword"));
    public static final Target BOTON_INGRESAR = Target.the("Boton ingresar").located(By.id("ctl00_m_g_2cbc234e_582a_4a65_ad96_bc55b5730f80_ctl00_lkbLogin"));
}
