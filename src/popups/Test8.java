package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test8 {

	public static void main(String[] args) {
		//chrome browser
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		
		//Firefox browser
		FirefoxOptions option1=new FirefoxOptions();
		option1.addArguments("--disable-notifications");
		WebDriver driver1=new FirefoxDriver(option1);
		
		
		
		driver.manage().window().maximize();
		driver.get("https://www.quikr.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

}
