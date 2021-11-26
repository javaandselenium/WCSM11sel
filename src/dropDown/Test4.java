package dropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
WebElement ele = driver.findElement(By.id("month"));
Select s=new Select(ele);
s.selectByIndex(0);
s.selectByValue("5");
s.selectByVisibleText("Jul");

List<WebElement> options = s.getOptions();
System.out.println(options.size());

ArrayList a=new ArrayList();

for(WebElement allOptions:options) {
	String text = allOptions.getText();
	a.add(text);
	System.out.println(text);
}

Collections.sort(a);

System.out.println("*********After sorting*********");

for(Object b:a)
{
	System.out.println(b);
}

driver.close();


	}

}
