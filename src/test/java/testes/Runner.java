package testes;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		stepNotifications = true,
		features = "src//test//resources//features",
		glue = {"testes"},
		plugin = {
				"pretty",
				"html:target//relatorio//Relatorio Teste.html"
		}
		
		)
public class Runner {

}
