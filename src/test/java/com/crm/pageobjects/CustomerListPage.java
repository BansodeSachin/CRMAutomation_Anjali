package com.crm.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerListPage {

	public WebDriver driver;
	
	By addButton = By.xpath("//input[@value='Add Customer']");
	
	
	
	public CustomerListPage(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getUpdateLink(int customerId) {
		
		By updateLink = By.xpath("//a[contains(@href,'showFormForUpdate') and contains(@href,'customerId="+customerId+"')]");
		
		return driver.findElement(updateLink);
	}
	
	public WebElement getDeleteLink(int customerId) {
		
		By deleteLink = By.xpath("//a[contains(@href,'delete') and contains(@href,'customerId="+customerId+"')]");
		
		return driver.findElement(deleteLink);
	}
	
	public WebElement getAddButton() {
		return driver.findElement(addButton);
	}
}
