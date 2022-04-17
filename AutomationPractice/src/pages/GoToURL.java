package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class GoToURL {
	
WebDriver driver = null;
	
	
	public GoToURL(WebDriver driver) {
		
		this.driver = driver;
	}
	public void gotoURL(){
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	
	}
	
		
	
}

		

