package co.gov.aerocivil.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/estado_financiero.feature",
        glue = "co.gov.aerocivil.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class EstadoFinanciero {
}
