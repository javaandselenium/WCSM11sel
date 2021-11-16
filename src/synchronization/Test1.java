package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		

WebDriverWait wait=new WebDriverWait(driver,10);

WebElement username = driver.findElement(By.name("username"));
wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("admin");

WebElement loginbtn = driver.findElement(By.xpath("//div[contains(@class,'qF0y9          Igw0E     IwRSH')]"));
wait.until(ExpectedConditions.elementToBeClickable(loginbtn)).click();

String tite = driver.getTitle();
wait.until(ExpectedConditions.titleContains("instagram"));

	}

	}


