package com.acti.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPageTests extends BaseTest {

	

	@Test(priority = 1, enabled = true)
	public void testLoginFunctionforTaskPg() throws InterruptedException
	{
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
		Thread.sleep(3000);
		String actual = ep.getUserLoggedIn();
		Assert.assertTrue(actual.contains("John"));
		System.out.println(actual);
		System.out.println("User Logged In");
		Thread.sleep(3000);
		ep.clickTaskMenu();
		Thread.sleep(3000);
//		 To Add new customer
		tp.clickAddNewButton();
		tp.clickNewCustomerOption();
		tp.enterCustomerName("TestCustomer");
		tp.enterCustomerDescription("Loyal Customer since 2010");
		Thread.sleep(3000);
		tp.clickcreatecustomerButton();
		System.out.println("createcustButton Clicked");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='text' and text()='Big Bang Company']")).click();
//		tkpg.ClickScrollBar();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("scroll(0,50)");
//		tkpg.MouseHovercreatedcusttab();
//		Thread.sleep(3000);
		String msg = tp.getSuccessMsg();
//		System.out.println(msg);
		Assert.assertTrue(msg.contains("has been created"));  //Customer name changes when creating new customers, so check with "has been created"
		ep.clickLogout();
	}
	
	@Test(priority = 2,enabled = true)
	public void testDeleteCustomer() throws InterruptedException
	{
	lp.enterUsername("admin"); lp.enterPassword ("manager");
	lp.clickLoginButton();
	String actual = ep.getUserLoggedIn();
	Assert.assertTrue(actual.contains("John Doe"));
	ep.clickTaskMenu();
	Thread.sleep(3000);
	tp.searchCreatedCustomer("TestCustomer"); 
	tp.clickSearchedCustomer();
	tp.clickEditButton();
	tp.clickAction();
	tp.clickDelete();
	tp.clickDeletePermanently();
	String msg = tp.getSuccessMsg();
//	System.out.println(msg);
	Assert.assertTrue(msg.contains("has been deleted"));
	ep.clickLogout();
	}
	

}
