package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("jhjjhjjhggj");
		driver.findElement(By.name("password")).sendKeys("yujhdgjhgdjhg");
		
		driver.findElement(By.xpath("//div[contains(@class,'qF0y9          Igw0E     IwRSH')]")).click();

	}

}
