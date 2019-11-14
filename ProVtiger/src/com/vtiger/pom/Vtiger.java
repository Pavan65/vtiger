package com.vtiger.pom;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.vtiger.generics.Constant;
import com.vtiger.generics.XL;


public class Vtiger implements Constant {
	public Vtiger(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public  void verifyHomePageIsDisplayed(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException 
	{	
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("HomePage is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("Home Page is not displayed",true);
			Assert.fail();
		}
	}
	
	public  void quotePage(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException 
	{	
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("Quote Page is created",true);
		}
		catch(Exception e)
		{
			Reporter.log("Quote Page is not created",true);
			Assert.fail();
		}
	}
	
}
