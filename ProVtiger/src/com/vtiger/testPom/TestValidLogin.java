package com.vtiger.testPom;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseTest;
import com.vtiger.generics.XL;
import com.vtiger.pom.LoginPage;
import com.vtiger.pom.Vtiger;


public class TestValidLogin extends BaseTest{
	@Test
	public static void validLogin() throws EncryptedDocumentException, InvalidFormatException
	{
	String un = XL.getData(XL_PATH,SHEET_NAME,2,0);
	String pwd = XL.getData(XL_PATH,SHEET_NAME,2,1);
	String title= XL.getData(XL_PATH,SHEET_NAME,2,2);
	LoginPage lp = new LoginPage(driver);
	lp.inputUN(un);
	lp.inputPWD(pwd);
	lp.loginClick();
	Vtiger  v= new Vtiger(driver);
	v.verifyHomePageIsDisplayed(driver, 5, title);	
	}

}
