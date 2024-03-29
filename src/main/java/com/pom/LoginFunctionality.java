package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginFunctionality extends TestBase {
	@FindBy(xpath = "//div[@class='navbar-tool-icon-box bg-secondary']//div[@class='navbar-tool-icon-box bg-secondary']//*[name()='svg']")
	WebElement show;
	@FindBy(xpath = "//a[normalize-space()='Sign in']")
	WebElement sign;
	@FindBy(id = "si-email")
	WebElement Email;
	@FindBy(id = "si-password")
	WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Sign in']")
	WebElement Login;

	public LoginFunctionality() {
		PageFactory.initElements(driver, this);
	}

	public void Loginverification(String username,String pass) throws Throwable {
		
		show.click();
		sign.click();
		Email.sendKeys(username);
		password.sendKeys(pass);
		Login.click();
		
		// Thread.sleep(1000);
		// driver.navigate().to(prop.getProperty("url"));
		// Thread.sleep(1000);
		// driver.findElement(By.xpath("//a[@class='font-size-sm']")).isDisplayed();

		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[@class='font-size-sm']")).isEnabled();

	}

}
