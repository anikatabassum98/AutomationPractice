package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class Checkoutpage {
	
WebDriver driver = null;
	
	By Checkoutxpath1 = By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]");
	By Checkoutxpath2 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]");
	By Checkoutpath3 = By.name("processAddress");
	By Checkoutpath4 = By.id("uniform-cgv");
	By Checkoutpath5 = By.name("processCarrier");
	By Checkoutxpath6 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]");
	By Checkoutxpath7 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]");
	//By BlueTxpath5 = By.xpath("//span[contains(text(),'More')]");
	//By BlueT6 = By.name("Blue");
	//By BlueTxpath7 = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]");
	
	
	
	public Checkoutpage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//add Blue t-shirt to cart
	public void Checkout1(){
		WebElement checkout1 = driver.findElement(Checkoutxpath1);
		checkout1.click();
	
	}	
	public void Checkout2(){
		WebElement checkout2 = driver.findElement(Checkoutxpath2);
		checkout2.click();
	}
	public void Checkout3(){
		WebElement checkout3 = driver.findElement(Checkoutpath3);
		checkout3.click();
	}
	public void Checkout4(){
		WebElement checkout4 = driver.findElement(Checkoutpath4);
		checkout4.click();
	}
	public void Checkout5(){
		WebElement checkout5 = driver.findElement(Checkoutpath5);
		checkout5.click();
	}
	public void Checkout6(){
		WebElement checkout6 = driver.findElement(Checkoutxpath6);
		checkout6.click();
	}
	public void Checkout7(){
		WebElement checkout7 = driver.findElement(Checkoutxpath7);
		checkout7.click();
	}
		
}

		
