package com.crm.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCustomerPage {

public WebDriver driver;
	
	By firstName = By.xpath("//input[@id='firstName']");
	By lastName = By.xpath("//input[@id='lastName']");
	By email = By.xpath("//input[@id='email']");
	By submit = By.xpath("//input[@type='submit']");
	
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}

	public WebElement getLastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getSubmitButton() {
		return driver.findElement(submit);
	}
	
}
