package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="user_name")
	private WebElement un;
	@FindBy(name="user_password")
	private WebElement pwd;	
	@FindBy(id="submitButton")
	private WebElement loginBtn;	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputUN(String text)
	{
		un.sendKeys(text);	
	}
	public void inputPWD(String text)
	{
		pwd.sendKeys(text);	
	}
	public void loginClick()
	{
		loginBtn.click();
	}
	
	
}
