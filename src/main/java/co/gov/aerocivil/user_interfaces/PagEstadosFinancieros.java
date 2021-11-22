package co.gov.aerocivil.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagEstadosFinancieros {

    public static final Target BALANCES = Target.the("Ir a la pagina principal").located(By.id("WebPartWPQ10"));
    //public static final Target PDF_ESTADO = Target.the("Ir a la pagina principal").locatedBy("//*[@id='paging_container3']/ul/li[1]/div/div/div/a[1]/img");
    public static final Target PDF_ESTADO = Target.the("Ir a la pagina principal").locatedBy("//*[@id='chordion']/div[2]//ul/li[1]//div/div/a[1]/img");

}
