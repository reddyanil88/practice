package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	
/*@Test(priority=1)
public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
{
	Reporter.log("CreateCustomer",true);
	FileLib f=new FileLib();
	String expCustName = f.getExcelData("CustomerModule",1,2);
	String custDesp = f.getExcelData("CustomerModule",1,3);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	Thread.sleep(3000);
	e.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustOption().click();
	t.getEnterCustTbx().sendKeys(expCustName);
	t.getEnterCustDesp().sendKeys(custDesp);
	t.getSelectCustDD().click();
	t.getOurCompanyTx().click();
	t.getCreateCustBtn().click();
	Thread.sleep(4000);
	String actualCustName = t.getActualCustCreateTx().getText();
	Assert.assertEquals(actualCustName, expCustName);
}*/

@Test(priority=2)
public void testDeleteCustomer() throws EncryptedDocumentException, IOException, InterruptedException
{
	Reporter.log("deleteCustomer",true);
	FileLib f=new FileLib();
	
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setTaskTab();
	Thread.sleep(3000);

	TaskListPage t=new TaskListPage(driver);

	t.getSearchbtn().sendKeys("sbi");
	Thread.sleep(3000);

	t.getSbilink().click();
	t.getSettings().click();
	t.getActionTab().click();
	t.getDelbtn().click();
	t.getDelperbtn().click();
	String atext="All Customers";
	String etext=t.getAllCustTx().getText();
	Assert.assertEquals(atext,etext);
	
}
}
