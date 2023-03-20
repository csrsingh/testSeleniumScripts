package testSeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
		Thread.sleep(5000);
		String alertmessage = driver.switchTo().alert().getText();
		if(alertmessage.equals("Please enter a valid user name"))
		{
			System.out.println("Correct Alert Message");
		}
		else
		{
			System.out.println("incorrect alet message");
		}
		driver.switchTo().alert().accept();
		

	}

}
