package co.gov.aerocivil.tasks;

import co.gov.aerocivil.user_interfaces.PagEstadosFinancieros;
import co.gov.aerocivil.user_interfaces.PagInicial;
import co.gov.aerocivil.user_interfaces.PagPresupuesto;
import co.gov.aerocivil.user_interfaces.PagTransparencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.requirements.reports.FileSystemRequirmentsOutcomeFactory;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;


import java.nio.charset.StandardCharsets;
import java.util.Set;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class GenerarEstadoFinanciero implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
        Click.on(PagInicial.MENU_TRANSPARENCIA),
                Click.on(PagTransparencia.OPC_PRESUPUESTO)
       );

        String tab = getDriver().getWindowHandle();

        for(String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }

        actor.attemptsTo(
                Click.on(PagPresupuesto.ESTADOS_FINANCIEROS),
                Click.on(PagEstadosFinancieros.BALANCES),
                Click.on(PagEstadosFinancieros.PDF_ESTADO)
        );

        String tab1 = getDriver().getWindowHandle();

        for(String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }

        String titulo = getDriver().getCurrentUrl();
        actor.remember("TITULO", titulo);

    }

    public static GenerarEstadoFinanciero actual() {
        return instrumented(GenerarEstadoFinanciero.class);
    }
}
