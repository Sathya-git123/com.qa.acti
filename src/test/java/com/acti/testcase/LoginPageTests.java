package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTest {

	@Test(enabled = true)
	public void testLoginPageTitle()
	{
		String expected = "actiTIME - Login";
		String actual = lp.getLoginPageTitle();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
	}

	@Test(enabled = true)
	public void testActiImgDisplayed()
	{
    	boolean flag = lp.verifyActiImg();
		Assert.assertTrue(flag);
		System.out.println("verify ActiImg");
	}

	@Test(enabled = true)
	public void testForgotPasswordDisplayed()
	{
		boolean flag = lp.verifyForgotpasswordLink();
		Assert.assertTrue(flag);
		System.out.println(flag);
	}

	@Test(enabled = true)
	public void testLoginFunction()
	{
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
//		String actual = ep.getUserLoggedIn();
//		Assert.assertTrue(actual.contains("John"));
//		ep.clickLogout();
	}

	@Test(enabled = false)
	public void testLoginInvalidCredientials() throws InterruptedException
	{
		lp.enterPassword("admin");
		lp.clickLoginButton();
		Thread.sleep(3000);
		String errmsg = lp.getErrMsgText();
		System.out.println(errmsg);
		Assert.assertTrue(errmsg.contains("Username or Password is invalid"));
	}
}
