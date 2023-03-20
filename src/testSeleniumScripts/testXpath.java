package testSeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testXpath {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Chandrashekhar Singh");
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("Shekhar@486");
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("Shekhar@486");
		driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("shekhar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("888888888");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).click();
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
		select.selectByVisibleText("20");
		
		Select select1 = new Select(driver.findElement(By.cssSelector("#tblcrtac > tbody:nth-child(1) > tr:nth-child(23) > td:nth-child(3) > select:nth-child(2)")));
		select1.selectByVisibleText("MAR");
		
		Select select2 = new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]")));
		select2.selectByVisibleText("1983");
		
		Select select3 = new Select (driver.findElement(By.cssSelector("#div_city > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > select:nth-child(1)")));
		select3.selectByVisibleText("Delhi");
		
		driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		driver.switchTo().alert().accept();
		
	}

}
