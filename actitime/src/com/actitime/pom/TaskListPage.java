package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDesp;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDD;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompanyTx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustCreateTx;
	
	
	@FindBy(xpath="//div/div[text()='SBI_007' and @class='text']")
	private WebElement sbilink;
	
	public WebElement getSbilink() {
		return sbilink;
	}

	@FindBy(xpath="//div[text()='SBI_007']/../../div[@class='editButton']")
	private WebElement settings;
	
	@FindBy(xpath="(//div[text()='ACTIONS' and @class='action'])[1]")
	private WebElement actionTab;
	
	@FindBy(xpath="'((//div[text()='Delete' and @class='title'])[1]")
	private WebElement delbtn;
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement delperbtn;
	
	@FindBy(xpath="//div[text()='All Customers' and @title='All Customers']")
	private WebElement allCustTx;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchbtn;
	
	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getSettings() {
		return settings;
	}

	public WebElement getActionTab() {
		return actionTab;
	}

	public WebElement getDelbtn() {
		return delbtn;
	}

	public WebElement getDelperbtn() {
		return delperbtn;
	}

	public WebElement getAllCustTx() {
		return allCustTx;
	}

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustOption() {
		return newCustOption;
	}

	public WebElement getEnterCustTbx() {
		return enterCustTbx;
	}

	public WebElement getEnterCustDesp() {
		return enterCustDesp;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getOurCompanyTx() {
		return ourCompanyTx;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}

	public WebElement getActualCustCreateTx() {
		return actualCustCreateTx;
	}
	
	
	
}
