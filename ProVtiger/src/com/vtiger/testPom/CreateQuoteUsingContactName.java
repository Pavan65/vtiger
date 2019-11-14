package com.vtiger.testPom;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseTest;
import com.vtiger.generics.XL;
import com.vtiger.pom.Home;
import com.vtiger.pom.LoginPage;
import com.vtiger.pom.Vtiger;

public class CreateQuoteUsingContactName extends BaseTest {
	@Test
	public static void QuotePageUsingContactName() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String un = XL.getData(XL_PATH,SHEET_NAME,2,0);
	String pwd = XL.getData(XL_PATH,SHEET_NAME,2,1);
	String title= XL.getData(XL_PATH,SHEET_NAME,2,3);
	String subName=XL.getData(XL_PATH, SHEET_NAME, 3,2);
	String billAdd=XL.getData(XL_PATH, SHEET_NAME, 4, 2);
	String shipAdd=XL.getData(XL_PATH, SHEET_NAME, 5, 2);
	LoginPage lp = new LoginPage(driver);
	lp.inputUN(un);
	lp.inputPWD(pwd);
	lp.loginClick();
	Home h= new Home(driver);
	
	WebElement txt = driver.findElement(By.xpath("//a[text()='More']"));
	Actions a= new Actions(driver);
	a.moveToElement(txt).build().perform();
	h.clickQuoteLink();
	h.clickOnQuotePlus();
	h.enterQuoteSubject(subName); 
	
	
	h.clickOnOpportunityPlusIcon();
	String parent= driver.getWindowHandle();
	Set<String> subTab= driver.getWindowHandles();
	for(String subtab0 : subTab)
	{
		driver.switchTo().window(subtab0);
	}
	h.clickAndSelectOpportunityName();
	driver.switchTo().window(parent);
	Thread.sleep(2000);
	
	
	
	h.clickOnContactNamePlusIcon();
	String parent1 = driver.getWindowHandle();
	Set<String> subTab1= driver.getWindowHandles();
	for(String subtab0 : subTab1)
	{
		driver.switchTo().window(subtab0);
	}
	h.selectContactName();
	Alert al=driver.switchTo().alert();
	System.out.println(al.getText());
	al.accept();
	driver.switchTo().window(parent1);
	Thread.sleep(2000);
	h.enterBillingAddress(billAdd);
	h.enterShippinggAddress(shipAdd);
	
	h.clickOnproductIcon();
	Thread.sleep(2000);
	String parent2 = driver.getWindowHandle();
	Set<String> subTab2 = driver.getWindowHandles();
	for(String tab : subTab2)
	{
		driver.switchTo().window(tab);
	}
	Thread.sleep(2000);
	h.selectProduct();
	Thread.sleep(2000);
	driver.switchTo().window(parent2);
	h.saveQuoteButton();
	Thread.sleep(4000);
	//Vtiger v= new Vtiger(driver);
	//v.quotePage(driver, 5, title);	
	}

}
