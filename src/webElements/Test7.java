package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("username"));
		
		if(username.isDisplayed())
		{
			System.out.println("Pass: username is dispalyed");
			username.sendKeys("admin");
		}
		else
		{
			System.out.println("Fail: username is not dispalyed");
		}
			
		driver.close();

	}

}
