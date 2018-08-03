package com.cg.RegistrationPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
/*public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\agile\\NewChromeDriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("file:D:\\agile\\RegistrationPage\\src\\main\\webpage\\registrationpage.html");
	

}*/
	private WebDriver driver;
	RegistrationForm page=null;
	NextPage page1=null;
	
	@Before()
	public void SetupStepEnv() {
		System.out.println("Env1");
		System.setProperty("webdriver.chrome.driver", "D:\\agile\\NewChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("file:D:\\\\agile\\\\RegistrationPage\\\\src\\\\main\\\\webpage\\\\registrationpage.html");
		
	}

@Given("^I have entered all the details$")
public void i_have_entered_all_the_details() {
	 page = PageFactory.initElements(driver, RegistrationForm.class);
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	page.fname.sendKeys("vaishnavi");
	page.lname.sendKeys("bawankule");
	page.email1.sendKeys("vaish@gmail.com");
	page.mobile.sendKeys("9922493800");
	page.add.sendKeys("Hinjewadi");
	page.city.sendKeys("Pune");
	page.state.get(1).click();
	
	
  
}

@When("^I press Submit$")
public void i_press_Submit() throws Throwable {
	page.sub.click();

}

@Then("^Go to next Page$")
public void go_to_next_Page() throws Throwable {
	 page1 = PageFactory.initElements(driver, NextPage.class);  
 page1.pname.sendKeys("Finance");
 page1.pdetail.sendKeys("Make app");
 page1.clientname.sendKeys("SBI");
 page1.team.sendKeys("3");
 page1.Submit.click();
}
}
