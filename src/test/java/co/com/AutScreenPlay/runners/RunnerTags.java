package co.com.AutScreenPlay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (features = "src/test/resources/features/prueba.feature",
        tags = "@Meeting",
        glue ="co.com.AutScreenPlay.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}


/* Report generated:
 Terminal> gradle clean test aggregate -Dtags=@Meeting
 Open> target/site/serenity/index.html
 */