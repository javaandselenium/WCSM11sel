package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement radiobutton = driver.findElement(By.name("sex"));
		
		if(radiobutton.isSelected()) {
			System.out.println("Pass: it is selected");
		}
		else
		{
			System.out.println("Fail: it is not selected");
		}
		
		driver.close();

	}

}
