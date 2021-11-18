package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement loginbtn = driver.findElement(By.xpath("//div[text()='Login ']"));

		if(loginbtn.isEnabled()) {
			System.out.println("Pass: element is enabled");
			loginbtn.click();
		}
		else
		{
			System.out.println("Fail: eleemnet is not enabled");
		}
		driver.close();
	}

}
