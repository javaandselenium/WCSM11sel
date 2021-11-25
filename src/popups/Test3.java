package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {

	public static void main(String[] args) throws AWTException {
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.selenium.dev/downloads/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.findElement(By.xpath("//a[text()='4.1.0']")).click();

Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_ENTER);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_ENTER);







		

	}

}
