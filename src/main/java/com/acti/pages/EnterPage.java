package com.acti.pages;

import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/* 
 * Name: EnterPage
 * Description: Manages the locators and methods of EnterPage
 * Developed By: Sathya
 * Reviewed By: Shantosh
 * Date Reviewed: 04-29-2023
 */

public class EnterPage extends DriverScript {
	
// *********************************** Page Locators **********************************//
		
	
// *********************************** Page Initialization ****************************//	
	
	public EnterPage() 
	{
		PageFactory.initElements (driver, this);
	}
		
// *********************************** Page Methods *********************************//	
	
}
