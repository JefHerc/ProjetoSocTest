package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerfilCredenciadoPage {
	
	WebDriver navegador;

	By nomeEmpresa	=	By.xpath("//div[@id='div-header-perfil']//span[@class='truncate detalhe-nome']");
	
	public PerfilCredenciadoPage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	
	
	public String verificarPerfil() {
		String perfilEmpresa = navegador.findElement(nomeEmpresa).getText();
		return perfilEmpresa;
	}
}
