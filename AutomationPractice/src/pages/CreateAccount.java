package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
WebDriver driver = null;
	
	By locator = By.className("login");
	By write_email = By.id("email_create");
	By createAccount = By.id("SubmitCreate");
	By MrMrs= By.xpath("//input[@value='2']");
	By customerFirstname = By.id("customer_firstname");
	By customerlastname = By.id("customer_lastname");
	By email = By.id("email");
	By password = By.id("passwd");
	By birthday = By.name("days");
	By birthmonth = By.name("months");
	By birthyear = By.name("years");
	By firstname = By.id("firstname");
	By lastname = By.id("lastname");
	By writeAddress = By.id("address1");
	By writeCity = By.id("city");
	By state = By.name("id_state");
	By country = By.name("id_country");
	By PO = By.id("postcode");
	By mobilephone = By.id("phone_mobile"); 
	By aliasAdd = By.id("alias");
	By submitAcc = By.id("submitAccount");
	By Logout = By.className("logout");
	By EmailAdd = By.id("email");
	By Pass = By.id("passwd");
	By SubmitLogIn = By.id("SubmitLogin");		
			
			
			
	
	public CreateAccount(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//click signin
	public void clicksigninButton(){
		
		WebElement element = driver.findElement(locator);
		element.click();
	
	}	
	public void WriteEmail(String text) {
		
		WebElement element = driver.findElement(write_email);
		element.sendKeys(text);
		
	}
	public void clickCreateAccountButton(){
		
		WebElement element = driver.findElement(createAccount);
		element.click();
		//driver.findElement(By.id("SubmitCreate")).click();
	}	
	public void MrMrsRadio() {
		WebElement radio = driver.findElement(MrMrs);
		radio.click();
	}
	//firstname1
	public void Firstname1click (){
		WebElement firstname1 = driver.findElement(customerFirstname);
		firstname1.click();
	}
	public void Firstname1 (String text){
		WebElement firstname1 = driver.findElement(customerFirstname);
		firstname1.sendKeys(text);
	}
	//lastname1
	public void Lastname1click (){
		WebElement lastname1 = driver.findElement(customerlastname);
		lastname1.click();
	}
	public void Lastname1 (String text){
		WebElement lastname1 = driver.findElement(customerlastname);
		lastname1.sendKeys(text);
	}
	//emailclick
	public void Emailclick (){
		WebElement emailclick = driver.findElement(email);
		emailclick.click();
	}
	//passwordset
	public void passwordclick (){
		WebElement pass = driver.findElement(password);
		pass.click();
	}
	public void Password (String text){
		WebElement pass = driver.findElement(password);
		pass.sendKeys(text);
	}
	//date of birth
	public void Day(String value) {
			WebElement Days = driver.findElement(birthday);
			Select selectDay = new Select(Days);
			selectDay.selectByValue(value);
	}
	public void Month(String value) {
		WebElement Months = driver.findElement(birthmonth);
		Select selectMonth = new Select(Months);
		selectMonth.selectByValue(value);
}
	public void Year(String value) {
		WebElement Years = driver.findElement(birthyear);
		Select selectYear = new Select(Years);
		selectYear.selectByValue(value);
	}
	//YOUR ADDRESS
	
	public void Firsttname2click (){
		WebElement firstname2 = driver.findElement(firstname);
		firstname2.click();
	}
	public void Firsttname2 (String text){
		WebElement firstname2 = driver.findElement(firstname);
		firstname2.sendKeys(text);
	}
	
	public void Lastname2click (){
		WebElement lastname2 = driver.findElement(lastname);
		lastname2.click();
	}
	public void Lastname2 (String text){
		WebElement lastname2 = driver.findElement(lastname);
		lastname2.sendKeys(text);
	}
	
	public void Addressclick (){
		WebElement address = driver.findElement(writeAddress);
		address.click();
	}
	public void Address (String text){
		WebElement address = driver.findElement(writeAddress);
		address.sendKeys(text);
	}
	public void Cityclick (){
		WebElement city = driver.findElement(writeCity);
		city.click();
	}
	public void City (String text){
		WebElement city = driver.findElement(writeCity);
		city.sendKeys(text);
	}
	//state
	public void State (String value) {
		WebElement eleState = driver.findElement(state);
		Select selectState = new Select(eleState);
		selectState.selectByVisibleText(value);		
	}
	//PO
	public void Postcodeclick (){
		WebElement postcode = driver.findElement(PO);
		postcode.click();
	}
	public void Postcode (String value){
		WebElement postcode = driver.findElement(PO);
		postcode.sendKeys(value);
	}
	
	
	//country
	public void Country(String value) {
		WebElement eleCountry = driver.findElement(country);
		Select selectCountry = new Select(eleCountry);
		selectCountry.selectByVisibleText(value);
	}
	//mobile no
	public void Mobileclick (){
		WebElement mobile = driver.findElement(mobilephone);
		mobile.click();
	}
	public void MobilePhone (String value){
		WebElement mobile = driver.findElement(mobilephone);
		mobile.sendKeys(value);
	}
	//alias
	public void Aliasclick (){
		WebElement alias = driver.findElement(aliasAdd);
		alias.click();
	}
	public void Alias (String value){
		WebElement alias = driver.findElement(aliasAdd);
		alias.sendKeys(value);
	}
	//submitAccount
	public void Submitclick (){
		WebElement submit1 = driver.findElement(submitAcc);
		submit1.click();
	}
	//logout
	public void LogoutClick (){
		WebElement logout = driver.findElement(Logout);
		logout.click();
	}
	
}

		

