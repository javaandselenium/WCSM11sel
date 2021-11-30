package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
         Properties p=new Properties();
         FileInputStream fis=new FileInputStream("./data.properties");
         p.load(fis);
         
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get(p.getProperty("url"));
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         
         driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
         driver.findElement(By.id("password")).sendKeys(p.getProperty("password"));
         
         
         
		


	}

}
