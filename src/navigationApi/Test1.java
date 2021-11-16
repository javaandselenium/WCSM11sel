package navigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	driver.navigate().to("https://www.amazon.com/");
	
	//back
	Thread.sleep(3000);
	driver.navigate().back();
	
	
	//forword
	Thread.sleep(3000);
	driver.navigate().forward();
	
	//refresh
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	
	Thread.sleep(3000);
	driver.close();
	
	}

}
