package com.vtiger.pom;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="Quotes")
	private WebElement quote;
	@FindBy(xpath="//img[@title=\"Create Quote...\"]") 
	private WebElement quotePlus;
	@FindBy(xpath="//input[@name=\"subject\"]")
	private WebElement quoteSubj;
	@FindBy(xpath="//input[@name=\"account_id\"]/following-sibling::img")
	private WebElement orgPlus;
	@FindBy(xpath="//a[text()='Jspiders']")
	private WebElement orgName;
	@FindBy(xpath="//td[2][@class=\"dvtCellInfo\"]/textarea[@class=\"detailedViewTextBox\"]")
	private WebElement billing;
	@FindBy(xpath="//td[4][@class=\"dvtCellInfo\"]/textarea[@class=\"detailedViewTextBox\"]")
	private WebElement shipping;
	@FindBy(xpath="//IMG[@id=\"searchIcon1\"]")
	private WebElement productName;
	@FindBy(xpath="//a[text()='java']")
	private WebElement selprod;
	@FindBy(xpath="//input[@onclick=\"this.form.action.value='Save';  return validateInventory('Quotes')\"]")
	private WebElement savebutton;
	@FindBy(name="quotestage")
	private WebElement quoSta;
	@FindBy(xpath="//option[@value=\"Accepted\"]")
	private WebElement selQuoStageAccepted;
	@FindBy(xpath="//option[@value=\\\"Delivered\\\"]")
	private WebElement selQuoStageDeliverd;
	@FindBy(xpath="//input[@name=\"assigntype\"][2]")
	private WebElement group;
	
	
	
	@FindBy(name="carrier")
	private WebElement carr;
	@FindBy(xpath="//option[@value=\"UPS\"]")
	private WebElement selCarr;
	
	
	
	@FindBy(xpath="//img[@onclick=\"selectPotential()\"]")
	private WebElement opplus;
	@FindBy(xpath="//a[text()='selenium']")
	private WebElement oppName;
	
	
	@FindBy(xpath="//input[@name=\"contact_id\"]/following-sibling::img")
	private WebElement conName;
	@FindBy(xpath="//a[text()=' venky']")
	private WebElement connName;
	
	
	@FindBy(xpath="//input[@onclick=\"return copyAddressRight(EditView)\"]")
	private WebElement radioBut;
	
	
	@FindBy(xpath="//b[text()='Copy Shipping address']")
	private WebElement radiobut1;
	
	@FindBy(xpath="//input[2][@class=\"crmbutton small create\"]")
	private WebElement addservice;
	@FindBy(xpath="//img[@id=\"searchIcon2\"]")
	private WebElement settingBut;
	@FindBy(xpath="//a[@id=\"popup_product_25\"]")
	private WebElement addserName;
	
	
	@FindBy(xpath="//a[text()='No Pain No Gain']/../../td/a[text()='edit']")
	private WebElement editbutton;
	
	
	
	
	public void clickQuoteLink()
	{
		quote.click();
	}
	public void clickOnQuotePlus()
	{
		quotePlus.click();
	}
	public void enterQuoteSubject(String name)
	{
		quoteSubj.sendKeys(name);
	}
	public void clickOnOrganisationPllusIcon()
	{
		orgPlus.click();
	}
	public void enterBillingAddress(String name)
	{
		billing.sendKeys(name);
	}
	public void enterShippinggAddress(String name)
	{
		shipping.sendKeys(name);
	}
	public void selectOrganisationName()
	{
		orgName.click();
	}
	public void clickOnproductIcon()
	{
		productName.click();
	}
	public void selectProduct()
	{
		selprod.click();
	}
	public void saveQuoteButton()
	{
		savebutton.click();
	}
	public void clickOnCarrier()
	{
		carr.click();
	}
	public void clickAndSelectCarrier()
	{
		selCarr.click();
	}
	public void clickOnQuoteStage()
	{
		quoSta.click();
	}
	public void clickAndSelectQuoteStageAccepted()
	{
		selQuoStageAccepted.click();
	}
	public void radioButtonGroup()
	{
		group.click();
	}
	public void clickOnOpportunityPlusIcon()
	{
		opplus.click();
	}
	public void clickAndSelectOpportunityName()
	{
		oppName.click();
	}
	public void clickOnContactNamePlusIcon()
	{
		conName.click();
	}
	public void selectContactName()
	{
		connName.click();
	}
	public void clickOnRadioButtonOfCopyBillingAddress()
	{
		radioBut.click();
	}
	public void clickOnRadioButtopnOfCopyShippingAddress()
	{
		radiobut1.click();
	}
	public void clickOnAddServices()
	{
		addservice.click();
	}
	public void clickOnAddServicesButton()
	{
		settingBut.click();
	}
	public void clickAndSelectServiceName()
	{
		addserName.click();
	}
	public void clickOnEditButton()
	{
		editbutton.click();
	}
	public void clickAndSelectQuotestageDeliverd()
	{
		selQuoStageDeliverd.click();
	}

	

}
