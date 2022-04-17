package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class SignOut {
	
WebDriver driver = null;
	
	
	public SignOut(WebDriver driver) {
		
		this.driver = driver;
	}
	public void signout1(){
		
		driver.findElement(By.className("logout")).click();
	
	}
	
	
}

		

