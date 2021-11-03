package testes;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.BlogPage;
import pages.SearchPage;
import suporte.ScreenshotTela;

public class TesteBuscaNoBlog {

	WebDriver navegador = DriverFactory.getDriver();
	BlogPage blogPage;
	SearchPage searchPage;

	@Dado("que estou na tela do principal do blog")
	public void que_estou_na_tela_do_principal_do_blog() {
		navegador.navigate().to("https://ww2.soc.com.br/blog/");
		blogPage = new BlogPage(navegador);
	}

	@E("digito no campo de procura a {string} no blog")
	public void digito_no_campo_de_procura_a_no_blog(String pesquisa) {
		blogPage.digitarPesquisa(pesquisa);
	}

	@Quando("pressiono enter")
	public void pressiono_enter() {
		blogPage.pressionarEnter();
	}

	@Entao("os resultados exibidos relacionados a pesquisa são exibidos na tela")
	public void resultados_exibidos_relacionados_a_pesquisa_são_exibidos_na_tela() {
		searchPage = new SearchPage(navegador);
		String resultadoBusca = searchPage.resutadoBusca();
		assertEquals("Resultados encontrados", resultadoBusca);
	}
	
	@Entao("a mensagem {string} é exibida na tela")
	public void a_mensagem_é_exibida_na_tela(String resultado) {
		searchPage = new SearchPage(navegador);
		String resultadoBusca = searchPage.resutadoBusca();
		assertEquals(resultado, resultadoBusca);
	}
	
	@After
	public void screenshot(Scenario cenario) {
		ScreenshotTela.tirar(navegador, cenario.getName());
	}
		
}
