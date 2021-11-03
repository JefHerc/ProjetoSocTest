package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedeCredenciadaSocnetPage {
	
	WebDriver navegador;
	Actions action;
	
	By btn_saibaMais =			By.xpath("//*[@id='conteudo-resultados']//section//button");
	By opt_empresa =			By.xpath("//*[@id='sec-toggle-busca']//span[text()='Empresa']");
	By txt_pesquisa =			By.id("ipt-busca-credenciado-2");
	By btn_buscar =				By.id("botao-buscar");
	By resultadoBusca =			By.xpath("//*[@id='conteudo-resultados']//section");
	
	public RedeCredenciadaSocnetPage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public RedeCredenciadaSocnetPage selecionarBuscaPorEmpresa() {
		WebDriverWait wait = new WebDriverWait(navegador, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(opt_empresa));
		navegador.findElement(opt_empresa).click();
	
		return this;
	} 
	
	public RedeCredenciadaSocnetPage digitarEmpresaDesejada(String empresa) {
		navegador.findElement(txt_pesquisa).sendKeys(empresa);
		
		return this;
	}
	
	public RedeCredenciadaSocnetPage clicarBotaoBuscarEmpresa() {
		navegador.findElement(btn_buscar).click();
		
		return this;
	}
	
	public RedeCredenciadaSocnetPage mouseFocoEmpresaDesejada() {
		WebElement resultadoEmpresa = navegador.findElement(resultadoBusca);
		action = new Actions(navegador);
		action.moveToElement(resultadoEmpresa).perform();
		System.out.println(resultadoEmpresa);
		
		return this;
	}
	
	public PerfilCredenciadoPage clicarBotaoSaibaMais() {
		navegador.findElement(btn_saibaMais).click();
	
		return new PerfilCredenciadoPage(navegador);
	}
}


