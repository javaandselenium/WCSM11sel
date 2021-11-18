package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement usernametb = driver.findElement(By.id("email"));
		
		Dimension s = usernametb.getSize();
		int heigth = s.getHeight();
		System.out.println(heigth +"The heigth of the elemnt");
		
		int width = s.getWidth();
		System.out.println(width +"the width o the element");
		
		driver.close();
		
		
	}

}
