package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SocnetPage {
	
	WebDriver navegador;

	By btn_buscarCredenciado =	By.xpath("//*[@data-id=\"41966c6\"]//*[contains(text(), \"Buscar credenciados\")]");
	
	public SocnetPage(WebDriver navegador) {
		this.navegador = navegador;
	}

	public RedeCredenciadaSocnetPage clicarBotaoBuscarCredenciados() {
		navegador.findElement(btn_buscarCredenciado).click();
		return new RedeCredenciadaSocnetPage(navegador);
	}

}
