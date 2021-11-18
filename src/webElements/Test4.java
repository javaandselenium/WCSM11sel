package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement usernametb = driver.findElement(By.id("email"));
		Point loc = usernametb.getLocation();
		int x = loc.getX();
		System.out.println(x + "x axis coordinates");

		int y = loc.getY();
		System.out.println(y + "y axis coordinates");

		driver.close();
	}

}
