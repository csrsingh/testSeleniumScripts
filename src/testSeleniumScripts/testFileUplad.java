package testSeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testFileUplad {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();
		//driver.switchTo().alert();
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")).sendKeys("cssingh.sv@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input")).sendKeys("Shekhar@486");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div[1]/div/div[3]/div[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"attachCV\"]")).sendKeys("C:\\Users\\csrsi\\OneDrive\\Desktop\\Resume_Chandrashekhar_Singh.docx");

	}

}
