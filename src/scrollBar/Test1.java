package scrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Create with strip lights']"));
         Point loc = ele.getLocation();
         int x=loc.getX();
         int y=loc.getY();
         
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy("+x+","+y+")");

Thread.sleep(3000);
ele.click();

	}

}
