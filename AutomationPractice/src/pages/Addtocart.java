package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class Addtocart {
	
WebDriver driver = null;
	
	By addtocartxpath1 = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]");
	By addtocartxpath2 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");	
	By addtocartxpath3 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
	By addtocartxpath4 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]");
	public Addtocart(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//add to cart
	public void AddtoCart1(){
		WebElement addtocart1 = driver.findElement(addtocartxpath1);
		addtocart1.click();
	
	}	
	public void AddtoCart2(){
		WebElement addtocart2 = driver.findElement(addtocartxpath2);
		addtocart2.click();
	
	}
	public void AddtoCart3(){
		//Instantiate Action Class
		Actions actions = new Actions(driver);
		//Retrieve WebElement to perform mouse hover 
		WebElement MouseHover1 = driver.findElement(addtocartxpath3);
		//Mouse hover
		actions.moveToElement(MouseHover1).perform();
	}
	public void AddtoCart4(){
		WebElement addtocart3 = driver.findElement(addtocartxpath4);
		addtocart3.click();
	
	}
	public void AddtoCart5() {
		
		driver.navigate().to("http://automationpractice.com/index.php?id_category=9&controller=category");
	}
}

		
