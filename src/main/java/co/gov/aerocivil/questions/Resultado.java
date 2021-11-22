package co.gov.aerocivil.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Resultado implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        String tituloPagina = actor.recall("TITULO");
        return tituloPagina;
    }
    public static Resultado resultadoPagina () {
        return new Resultado();
    }
}
