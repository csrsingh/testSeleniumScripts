package testSeleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class testMouseMove {
	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://freecrm.com/");
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("cssingh.sv@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Shekhar@486");
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
			Thread.sleep(5000);
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/a/i"))).build().perform();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/a/span")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/button")).click();
			Actions action1 = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input"))).build().perform();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")).sendKeys("Chandrashehar");
		}
	}