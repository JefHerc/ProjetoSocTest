package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BlogPage {

	WebDriver navegador;
	Actions action;

	By txt_pesquisa = By.xpath("//div[@data-id= '0d410f5']//input[@name='s']");
	By lst_funcionalidades = By.xpath("//ul[@id='menu-1-4350684']//a[text() = 'Funcionalidades']");
	By opt_redeSocnet = By.xpath("//a[text() = 'Rede SOCNET']");

	public BlogPage(WebDriver navegador) {
		this.navegador = navegador;
	}

	public BlogPage digitarPesquisa(String pesquisa) {
		navegador.findElement(txt_pesquisa).click();
		navegador.findElement(txt_pesquisa).sendKeys(pesquisa);
		return this;
	}

	public SearchPage pressionarEnter() {
		navegador.findElement(txt_pesquisa).sendKeys(Keys.ENTER);
		;
		return new SearchPage(navegador);
	}

	public BlogPage cursorEmFuncionalidades() {
		action = new Actions(navegador);
		action.moveToElement(navegador.findElement(lst_funcionalidades)).perform();
		action.click(navegador.findElement(lst_funcionalidades));
		return this;
	}

	public SocnetPage selecionarRedeSocnet() {
		action.click(navegador.findElement(opt_redeSocnet));
		action.build().perform();
		return new SocnetPage(navegador);
	}

}
