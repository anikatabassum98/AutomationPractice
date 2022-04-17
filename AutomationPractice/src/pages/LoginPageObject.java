package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class LoginPageObject {
	
WebDriver driver = null;
	
	By EmailAdd = By.id("email");
	By Pass = By.id("passwd");
	By SubmitLogIn = By.id("SubmitLogin");		
			
	public LoginPageObject(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//login
	public void EmailAddclick(){
		WebElement emailadd = driver.findElement(EmailAdd);
		emailadd.click();
	}	
	public void WriteEmailAdd(String text) {
		WebElement emailadd = driver.findElement(EmailAdd);
		emailadd.sendKeys(text);
	}
	//password
	public void Writepassclick(){
		WebElement passwd = driver.findElement(Pass);
		passwd.click();
	}	
	public void Writepassword(String text) {
		WebElement passwd = driver.findElement(Pass);
		passwd.sendKeys(text);
	}
	//submitLogin
	public void SubmitLoginclick(){
		WebElement submitlogin = driver.findElement(SubmitLogIn);
		submitlogin.click();
	}
	
	
}

		


		
		