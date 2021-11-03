package suporte;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	
	public static WebDriver createChrome() {
		// Abrindo o navegador
		System.setProperty("webdriver.chrome.driver", "src//test//resources//drivers//chromedriver.exe");
		WebDriver navegador = new ChromeDriver();

		// Criar espera para que o webDriver aguarde os elementos aparecerem
		navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Solicitando que a janela abra maximizada.
		navegador.manage().window().maximize();

		return navegador;
	}
}
