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

public class EditQuote extends BaseTest {
	@Test
	public static void EditQuotePage() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String un = XL.getData(XL_PATH,SHEET_NAME,2,0);
	String pwd = XL.getData(XL_PATH,SHEET_NAME,2,1);
	String title= XL.getData(XL_PATH,SHEET_NAME,2,3);
	LoginPage lp = new LoginPage(driver);
	lp.inputUN(un);
	lp.inputPWD(pwd);
	lp.loginClick();
	Home h= new Home(driver);
	
	WebElement txt = driver.findElement(By.xpath("//a[text()='More']"));
	Actions a= new Actions(driver);
	a.moveToElement(txt).build().perform();
	h.clickQuoteLink();
	h.clickOnEditButton();
	h.clickOnQuoteStage();
	h.clickAndSelectQuotestageDeliverd();
	//h.saveQuoteButton();
	//Vtiger v= new Vtiger(driver);
	//v.quotePage(driver, 5, title);	
	}

}
