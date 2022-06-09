package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.projectspecificmethod;

public class EditLead extends projectspecificmethod{
	public EditLead(RemoteWebDriver inwardDriver) {
		this.driver=inwardDriver;
	}
	public EditLead newcompanyname(String updateLeadFormcompanyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updateLeadFormcompanyName);
	    return this;
	}
	

	public EditLead clickupdate() {
		driver.findElement(By.name("submitButton")).click();
	    return this;}
}
