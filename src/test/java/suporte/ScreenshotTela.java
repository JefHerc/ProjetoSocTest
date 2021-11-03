package suporte;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotTela {

	public static void tirar(WebDriver navegador, String nome) {
		File imgScreenshot = ((TakesScreenshot) navegador).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imgScreenshot, new File("target//screenshot//" + nome + 
					"_" + Generator.dataHoraParaArquivo() + ".jpg"));
		} catch (IOException e) {
			System.out.println("Algo deu errado ao efetuar o printScreen" + e);
		}

	}
}
