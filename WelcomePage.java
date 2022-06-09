package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.projectspecificmethod;

public class WelcomePage extends projectspecificmethod{
	public WelcomePage(RemoteWebDriver inwardDriver) {
		this.driver=inwardDriver;
	}
	public myHome clickCRMSFA () {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		return new myHome(driver);
}
}