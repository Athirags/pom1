package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.projectspecificmethod;

public class AccountDetails extends projectspecificmethod{
	public AccountDetails(RemoteWebDriver inwardDriver) {
		this.driver=inwardDriver;
	}
	public  EditAccount Clickeditbutton() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditAccount(driver);
	}	
	
}
