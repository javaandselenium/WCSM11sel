package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
	//to Launch the browser
		WebDriver driver=new ChromeDriver();
//to enter the url in the browser and also wait untill the application is launched
		driver.get("https://www.facebook.com/");

	}

}
