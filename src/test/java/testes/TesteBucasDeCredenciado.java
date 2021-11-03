package testes;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.BlogPage;
import pages.PerfilCredenciadoPage;
import pages.RedeCredenciadaSocnetPage;
import pages.SocnetPage;

public class TesteBucasDeCredenciado {

	WebDriver navegador = DriverFactory.getDriver();
	BlogPage blogPage;
	PerfilCredenciadoPage perfilCredenciadoPage;
	RedeCredenciadaSocnetPage redeCredenciadaSocnetPage;
	SocnetPage socnetPage;

	@Dado("que estou na tela do blog")
	public void que_estou_na_tela_do_principal_do_blog() {
		navegador.navigate().to("https://ww2.soc.com.br/blog/");
		blogPage = new BlogPage(navegador);
	}

	@E("posiciono o cursor do mouse na guia Funcionalidades")
	public void posiciono_o_cursor_do_mouse_na_guia_funcionalidades() {
		blogPage.cursorEmFuncionalidades();
	}

	@E("seleciono a opcao RedeSOCNET")
	public void seleciono_a_opcao_rede_socnet() {
		blogPage.selecionarRedeSocnet();
	}

	@E("clico no botao Buscar credenciados")
	public void clico_no_botao_buscar_credenciados() {
		socnetPage = new SocnetPage(navegador);
		socnetPage.clicarBotaoBuscarCredenciados();
	}

	@E("seleciono a opcao empresa")
	public void seleciono_a_opcao_empresa() {
		redeCredenciadaSocnetPage = new RedeCredenciadaSocnetPage(navegador);
		redeCredenciadaSocnetPage.selecionarBuscaPorEmpresa();
	}

	@E("digito o nome da {string} dejada")
	public void digito_o_nome_da_dejada(String empresa) {
		redeCredenciadaSocnetPage.digitarEmpresaDesejada(empresa);
	}

	@And("clico em busca")
	public void clico_em_busca() {
		redeCredenciadaSocnetPage.clicarBotaoBuscarEmpresa();
	}

	@E("posiciono o cursor do mouse na localizada")
	public void posiciono_o_cursor_do_mouse_na_desejada() {
		redeCredenciadaSocnetPage.mouseFocoEmpresaDesejada();
	}

	@Quando("clico no botao Saiba Mais")
	public void clico_no_botao_saiba_mais() {
		redeCredenciadaSocnetPage.clicarBotaoSaibaMais();
	}

	@Entao("o perfil da {string} e exibido")
	public void o_perfil_da_e_exibido(String empresa) {
		perfilCredenciadoPage = new PerfilCredenciadoPage(navegador);
		String NomeEmpresa = perfilCredenciadoPage.verificarPerfil();
		assertTrue(empresa.equalsIgnoreCase(NomeEmpresa));
	}
		
}
