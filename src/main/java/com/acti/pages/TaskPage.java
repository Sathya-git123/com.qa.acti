package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;
import com.acti.utils.Helper;

/* 
 * Name: Task Page
 * Description: Manages the locators and methods of Task Page
 * Developed By: Sathya
 * Reviewed By: Santhosh
 * Date Reviewed: 04-27-2023
 */

public class TaskPage extends DriverScript {
	
// *********************************** Page Locators **********************************//
	
//	@FindBy(xpath = "//a[@class='content tasks']") WebElement tasksMenu;
	@FindBy(xpath = "//div[@class='title ellipsis']") WebElement addNewButton;
	@FindBy(xpath = "//div[@class='item createNewCustomer']") WebElement newCustomerOption;
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement customerNameTb;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']") WebElement customerDescriptionTArea;
//	@FindBy(xpath = "//div[@class='emptySelection']") WebElement selectcustDropdown ;
//	@FindBy(xpath = "//div[text()='Big Bang Company']") WebElement additemDropdown ;
	@FindBy(xpath = "//div[text()='Create Customer']") WebElement createCustomerButton ;
	@FindBy(xpath = "//span[@class='innerHtml']") WebElement successMsg;//Inspect,go to source,pause to get xpath as it vanishes fast. Then play 
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]") WebElement textboxStartTyping;
	@FindBy(xpath="//div[@class='filteredContainer']//div[@class='title']") WebElement searchedCustomer;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']") WebElement buttonEdit;
	@FindBy(xpath="//div[@class='editCustomerPanelHeader']//div[@class='action'] [normalize-space ()='ACTIONS']") 	WebElement buttonAction;
	@FindBy(xpath="//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space () = 'Delete']") WebElement buttonDelete;
	@FindBy(xpath="//span[normalize-space()='Delete permanently']") WebElement buttonDeletePermanently;
//	@FindBy(xpath = "//div[@class='node customerNode editable notSelected']") WebElement SelectCreatedCust ;
//	@FindBy(xpath = "//div[@class='unfilteredContainer']//div[@class='iScrollIndicator']") WebElement ScrollBar;
	
// *********************************** Page Initialization ****************************//	
	
	public TaskPage()
	{
		    PageFactory.initElements (driver, this);
	}
		
// *********************************** Page Methods *********************************//	
	
	public void clickDeletePermanently()
	{
	   buttonDeletePermanently.click();
	   Helper.sleep();
	}
	
	public void clickDelete()
	{
		buttonDelete.click();
	}
	public void clickAction()
	{
		buttonAction.click();
		Helper.sleep();
	}
	
	public void clickEditButton()
	{
	 buttonEdit.click(); 
	 Helper.sleep();
	}
	
	public void clickSearchedCustomer() 
	{
	     searchedCustomer.click();
	}
	
	public void searchCreatedCustomer(String customername)
    { 
		textboxStartTyping.sendKeys(customername);
	}
	public void clickAddNewButton()
	{ 
		addNewButton.click();
	}
	
	public void clickNewCustomerOption()
	{ 
		newCustomerOption.click();
	}
	
	public void enterCustomerName(String customername)
	{ 
		customerNameTb.sendKeys(customername);
	}
	
	public void enterCustomerDescription(String customerDescription)
	{ 
		customerDescriptionTArea.sendKeys(customerDescription);
	}
	
	public void clickcreatecustomerButton()
	{ 
		createCustomerButton.click();
	}
	
	public String getSuccessMsg()
	{ 
		return successMsg.getText();
	}
	
//	public void clickSelectCustDropdown()   //selecting the customer dropdown
//	{ 
//		selectcustDropdown.click();
//	}
//	
//	public void clickItemDropdown()
//	{ 
//		additemDropdown.click();
//	}
	
//	public void ClickScrollBar()
//	{ 
//		//Actions mhover = new Actions(driver);
//		
//		//mhover.moveToElement(SelectCreatedCust).build().perform();
//		ScrollBar.click();
//	}
	
}
