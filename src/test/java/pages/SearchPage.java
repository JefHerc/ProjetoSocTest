package pages;

import org.openqa.selenium.WebDriver;

public class SearchPage {
	
	WebDriver navegador;
	
	public SearchPage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public String resutadoBusca() {
		Boolean buscaBemSucedida = !navegador.getPageSource().contains("Nenhum resultado encontrado");
		String resultadoEncontrado = buscaBemSucedida ? "Resultados encontrados" : "Nenhum resultado encontrado";
		return resultadoEncontrado;
	}

}
