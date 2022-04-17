package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import pages.PracticeAutomationPageObjects;
import pages.Addtocart;
import pages.BlueTshirtpage;
import pages.Checkoutpage;
import pages.CreateAccount;
import pages.GoToURL;
import pages.LoginPageObject;
import pages.SignOut;

public class PracticeAutomationTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GoToURL URLobj = new GoToURL(driver);
		CreateAccount PageObj = new CreateAccount(driver);
		LoginPageObject loginpageObj = new LoginPageObject(driver);
		Addtocart cartObj = new Addtocart(driver);
		BlueTshirtpage BlueObj = new BlueTshirtpage(driver);
		Checkoutpage CheckObj = new Checkoutpage(driver);
		SignOut signObj = new SignOut(driver);
		
		//go to URL
		URLobj.gotoURL();
		//driver.get("http://automationpractice.com/index.php");
		//driver.manage().window().maximize();
		
		//first account register
		PageObj.clicksigninButton();
		PageObj.WriteEmail("anikatabassumbup20@gmail.com");
		PageObj.clickCreateAccountButton();
		
		//wait for next page for load
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		String pageHeading = driver.findElement(By.className("page-heading")).getText();
		System.out.println("Page Heading:"+pageHeading);
		
		//form
		//YOUR PERSONAL INFORMATION
		PageObj.MrMrsRadio();
		PageObj.Firstname1click();
		PageObj.Firstname1("Anika");
		PageObj.Lastname1click();
		PageObj.Lastname1("Tabassum");
		PageObj.Emailclick();
		PageObj.passwordclick();
		PageObj.Password("12345");
		PageObj.Day("7");
		PageObj.Month("6");
		PageObj.Year("1999");
	
		//YOUR ADDRESS
		
		PageObj.Firsttname2click();
		PageObj.Firsttname2("Anika");
		PageObj.Lastname2click();
		PageObj.Lastname2("Tabassum");
		PageObj.Addressclick();
		PageObj.Address("49 Green Road");
		PageObj.Cityclick();
		PageObj.City("Dhaka");
		PageObj.State("California");
		PageObj.Country("United States");
		PageObj.Postcodeclick();
		PageObj.Postcode("32056");
		PageObj.Mobileclick();
		PageObj.MobilePhone("+8801234567892");
		PageObj.Aliasclick();
		PageObj.Alias("41 Green Road");
		
		//submit
		PageObj.Submitclick();
		//logout
		PageObj.LogoutClick();
		

		//second account register
		PageObj.clicksigninButton();
		PageObj.WriteEmail("muniakhan18@gmail.com");
		PageObj.clickCreateAccountButton();
		
		//wait for next page for load
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		//String pageHeading = driver.findElement(By.className("page-heading")).getText();
		//System.out.println("Page Heading:"+pageHeading);
		
		//form
		//YOUR PERSONAL INFORMATION
		PageObj.MrMrsRadio();
		PageObj.Firstname1click();
		PageObj.Firstname1("Munia");
		PageObj.Lastname1click();
		PageObj.Lastname1("Khan");
		PageObj.Emailclick();
		PageObj.passwordclick();
		PageObj.Password("12346");
		PageObj.Day("5");
		PageObj.Month("5");
		PageObj.Year("2000");
	
		//YOUR ADDRESS
		
		PageObj.Firsttname2click();
		PageObj.Firsttname2("Munia");
		PageObj.Lastname2click();
		PageObj.Lastname2("Khan");
		PageObj.Addressclick();
		PageObj.Address("53 White Road");
		PageObj.Cityclick();
		PageObj.City("Dhaka");
		PageObj.State("Florida");
		PageObj.Country("United States");
		PageObj.Postcodeclick();
		PageObj.Postcode("33344");
		PageObj.Mobileclick();
		PageObj.MobilePhone("+8801222567892");
		PageObj.Aliasclick();
		PageObj.Alias("21 Pink Road");
		
		//submit
		PageObj.Submitclick();
		//logout
		PageObj.LogoutClick();
		
		
		//for first user
		//login
		PageObj.clicksigninButton();
		loginpageObj.EmailAddclick();
		loginpageObj.WriteEmailAdd("anikatabassumbup20@gmail.com");
		loginpageObj.Writepassclick();
		loginpageObj.Writepassword("12345");
		loginpageObj.SubmitLoginclick();
				
		//Casual Dress add to cart
		cartObj.AddtoCart1();
		cartObj.AddtoCart2();
		cartObj.AddtoCart3();
		cartObj.AddtoCart4();
		cartObj.AddtoCart5();
		
		//Blue T-shirt addtocart
		BlueObj.BlueTshirt1();
		BlueObj.BlueTshirt2();
		BlueObj.BlueTshirt3();
		BlueObj.BlueTshirt4();
		BlueObj.BlueTshirt5();
		BlueObj.BlueTshirt6();
		BlueObj.BlueTshirt7();
		
		//checkout
		CheckObj.Checkout1();
		CheckObj.Checkout2();
		CheckObj.Checkout3();
		CheckObj.Checkout4();
		CheckObj.Checkout5();
		CheckObj.Checkout6();
		CheckObj.Checkout7();
		
		//signout
		signObj.signout1();
		
		//for second user
		//login
		PageObj.clicksigninButton();
		loginpageObj.EmailAddclick();
		loginpageObj.WriteEmailAdd("muniakhan18@gmail.com");
		loginpageObj.Writepassclick();
		loginpageObj.Writepassword("12346");
		loginpageObj.SubmitLoginclick();
						
		//Casual Dress add to cart
		cartObj.AddtoCart1();
		cartObj.AddtoCart2();
		cartObj.AddtoCart3();
		cartObj.AddtoCart4();
		cartObj.AddtoCart5();
				
		//Blue T-shirt addtocart
		BlueObj.BlueTshirt1();
		BlueObj.BlueTshirt2();
		BlueObj.BlueTshirt3();
		BlueObj.BlueTshirt4();
		BlueObj.BlueTshirt5();
		BlueObj.BlueTshirt6();
		BlueObj.BlueTshirt7();
				
		//checkout
		CheckObj.Checkout1();
		CheckObj.Checkout2();
		CheckObj.Checkout3();
		CheckObj.Checkout4();
		CheckObj.Checkout5();
		CheckObj.Checkout6();
		CheckObj.Checkout7();
				
		//signout
		signObj.signout1();
		
		driver.close();
	}

}
