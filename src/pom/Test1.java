package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	SkillRray s=new SkillRray(driver);
	s.loginbtn();
	s.username("admin");
	s.password("manager");
	s.sumbit();

	}

}
