package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/* 
 * Name: Task Page
 * Description: Manages the locators and methods of Task Page
 * Developed By: Sathya
 * Reviewed By: Santhosh
 * Date Reviewed: 04-27-2023
 */

public class TaskPage extends DriverScript {
	
// *********************************** Page Locators **********************************//
	
	@FindBy(xpath = "//a[@class='content selected tasks']") WebElement tasksMenu;
	@FindBy(xpath = "//div[@class='title ellipsis']") WebElement addnewButton;
	@FindBy(xpath = "//div[@class='item createNewCustomer']") WebElement newcustButton;
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement custnameTextbox;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement custdescTextbox;
	@FindBy(xpath = "//div[@class='emptySelection']") WebElement selectcustDropdown ;
	@FindBy(xpath = "//div[text()='Big Bang Company']") WebElement additemDropdown ;
	@FindBy(xpath = "//div[text()='Create Customer']") WebElement createcustButton ;
	
// *********************************** Page Initialization ****************************//	
	
	public TaskPage()
	{
		    PageFactory.initElements (driver, this);
	}
		
// *********************************** Page Methods *********************************//	
	
	public void clickTasksMenu()
	{ 
		tasksMenu.click();
	}
	
	public void clickAddNewbutton()
	{ 
		addnewButton.click();
	}
	
	public void clickNewCustButton()
	{ 
		newcustButton.click();
	}
	
	public void enterCustName(String custname)
	{ 
		custnameTextbox.sendKeys(custname);
	}
	
	public void enterCustDesc(String custdesc)
	{ 
		custdescTextbox.sendKeys(custdesc);
	}
	
	public void clickSelectCustDropdown()
	{ 
		selectcustDropdown.click();
	}
	
	public void clickItemDropdown()
	{ 
		additemDropdown.click();
	}
	
	public void clickCustDropdown()
	{ 
		createcustButton.click();
	}
}
