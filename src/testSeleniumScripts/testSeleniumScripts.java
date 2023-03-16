package testSeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testSeleniumScripts {

	public static void main(String[] args) {
		WebDriver drv = new ChromeDriver();
		//WebDriver drv = new FirefoxDriver();
		drv.get("www.google.com");

	}

}
