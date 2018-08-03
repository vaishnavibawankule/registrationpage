package com.cg.RegistrationPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NextPage {

	@FindBy(how=How.NAME,using="pname")
	WebElement pname;
	@FindBy(how=How.NAME,using="pdetail")
	WebElement pdetail;
	@FindBy(how=How.NAME,using="clientname")
	WebElement clientname;
	@FindBy(how=How.NAME,using="team")
	WebElement team;
	
	@FindBy(how=How.CLASS_NAME,using="success")
	WebElement Submit;
	
}
