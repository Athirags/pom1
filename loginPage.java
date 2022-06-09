package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.projectspecificmethod;

public class loginPage extends projectspecificmethod {
	public loginPage(RemoteWebDriver inwardDriver) {
		this.driver=inwardDriver;
	}
public loginPage enterusername(String UserName) {
	driver.findElement(By.id("username")).sendKeys(UserName);
	return this;
}

public loginPage enterpassword(String Password) {
	driver.findElement(By.id("password")).sendKeys(Password);
	return this;
}
public WelcomePage clickloginbutton () {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new WelcomePage(driver);
}

}