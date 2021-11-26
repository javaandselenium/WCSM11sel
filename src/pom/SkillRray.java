package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRray {
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement loginbutton;
	
	@FindBy(name="email")
	private WebElement usernametb;
	
	@FindBy(name="password")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement sumbitbutton;
	
	public SkillRray(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void loginbtn() {
		loginbutton.click();
	}
	
	public void username(String us) {
		usernametb.sendKeys(us);
	}
	
	public void password(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void sumbit() {
		sumbitbutton.click();
	}
	
	

}
