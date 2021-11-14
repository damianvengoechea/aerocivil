package co.gov.aerocivil.stepDefinitions;

import co.gov.aerocivil.tasks.AbrirNavegador;
import co.gov.aerocivil.tasks.GenerarEstadoFinanciero;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EstadoFinancieroStepDefinition {


    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^Damian esta en la pagina de la aerocivil$")
    public void damianEstaEnLaPaginaDeLaAerocivil() {
        theActorCalled("Damian")
                .wasAbleTo(AbrirNavegador.conUrl());
    }

    @Cuando("^genera el informe del estado financiero$")
    public void generaElInformeDelEstadoFinanciero() {
        theActorInTheSpotlight().attemptsTo(GenerarEstadoFinanciero.actual());
    }

    @Entonces("^debera validar que se genero el archivo$")
    public void deberaValidarQueSeGeneroElArchivo() {

    }


}
