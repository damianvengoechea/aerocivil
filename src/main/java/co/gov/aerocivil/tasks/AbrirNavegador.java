package co.gov.aerocivil.tasks;

import co.gov.aerocivil.user_interfaces.PagInicial;
import co.gov.aerocivil.user_interfaces.PagTransparencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Task {


    private PagInicial paginaInicial;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaInicial));
    }

    public static Performable conUrl() {
        return instrumented(AbrirNavegador.class);
    }

}
