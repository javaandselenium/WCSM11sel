package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(checkbox.isSelected()) {
			System.out.println("Pass:it is selected");
		}
		else
		{
			System.out.println("Fail: it is not selected");
		}
		
		driver.close();

	}

}
