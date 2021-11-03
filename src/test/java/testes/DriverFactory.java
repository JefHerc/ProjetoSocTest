package testes;

import org.openqa.selenium.WebDriver;

import suporte.Web;

public class DriverFactory {
	
	private static WebDriver driver;
	
	private DriverFactory() {
	}
	
	public static WebDriver getDriver() {
		if (driver == null) {
			driver = Web.createChrome();
		}
		return driver;
	}
	
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
