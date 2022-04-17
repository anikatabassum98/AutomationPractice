package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class BlueTshirtpage {
	
WebDriver driver = null;
	
	By BlueTxpath1 = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]");
	By BlueT2 = By.name("layered_id_attribute_group_14");	
	By BlueTxpath3 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]");
	By BlueTxpath4 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
	By BlueTxpath5 = By.xpath("//span[contains(text(),'More')]");
	By BlueT6 = By.name("Blue");
	By BlueTxpath7 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]");
	
	
	
	public BlueTshirtpage(WebDriver driver) {
		
		this.driver = driver;
	}
		
	//add Blue t-shirt to cart
	public void BlueTshirt1(){
		WebElement bluetee1 = driver.findElement(BlueTxpath1);
		bluetee1.click();
	
	}	
	public void BlueTshirt2(){
		WebElement bluetee2 = driver.findElement(BlueT2);
		bluetee2.click();
	
	}
	public void BlueTshirt3(){
		//Instantiate Action Class
    	Actions action2 = new Actions(driver);
    	//Retrieve WebElement to perform mouse hover 
    	WebElement MouseHover2 = driver.findElement(BlueTxpath4);
    	//Mouse hover
    	action2.moveToElement(MouseHover2).perform();
	}
	public void BlueTshirt4(){
		WebElement bluetee4 = driver.findElement(BlueTxpath5);
		bluetee4.click();
	
	}
	public void BlueTshirt5(){
		WebElement bluetee5 = driver.findElement(BlueT6);
		bluetee5.click();
	
	}
	public void BlueTshirt6(){
		WebElement bluetee6 = driver.findElement(BlueTxpath7);
		bluetee6.click();
	
	}
	public void BlueTshirt7() {
		
		driver.navigate().to("http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-blue");
	}

	
	
}

		
