package testSeleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testDynamicXpath {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Absolute path
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sechandrashekharsingh");

		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sechandrashekharsingh");
		
		//driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("sechandrashekharsingh");
		
		//driver.findElement(By.xpath("//input[contains(@name,'emai')]")).sendKeys("sechandrashekharsingh");
		
		driver.findElement(By.xpath("//input[starts-with(@class,'inputtext _')]")).sendKeys("sechandrashekharsingh");

		//driver.findElement(By.xpath("//input[starts-with(@class,'inputtext _')]")).sendKeys("sechandrashekharsingh");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("sechandrashekharsingh");

	}

}
