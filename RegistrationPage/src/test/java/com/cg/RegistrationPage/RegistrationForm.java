package com.cg.RegistrationPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationForm {

	@FindBy(how=How.NAME,using="fname")
	WebElement fname;
	
	@FindBy(how=How.NAME,using="lname")
	WebElement lname;
	
	@FindBy(how=How.NAME,using="email1")
	WebElement email1;
	
	@FindBy(how=How.NAME,using="mob")
	WebElement mobile;
	
	@FindBy(how=How.NAME,using="add")
	WebElement add;
	
	@FindBy(how=How.NAME,using="city")
	WebElement city;
	
	@FindBy(how=How.CLASS_NAME,using="option")
	List<WebElement> state;
	
	@FindBy(how=How.CLASS_NAME,using="sub")
	WebElement sub;
	
}
