package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) throws IOException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.naukri.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.findElement(By.xpath("//label[contains(text(),'Upload CV')]")).click();

Runtime.getRuntime().exec("C:\\Users\\QSP\\Desktop\\Autoit\\uploadpopup5.exe");

	}

}
