package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.projectspecificmethod;

public class ViewLead extends projectspecificmethod {
	public ViewLead(RemoteWebDriver inwardDriver) {
		this.driver=inwardDriver;
	}
public ViewLead verifyviewlead() {
	boolean displayed = driver.findElement(By.id("sectionHeaderTitle_leads")).isDisplayed();
	if(displayed) {
		System.out.println("View Lead HomePage Displayed");
	}
	else
	{
		System.out.println(" View Lead Home page is not displayed");
	}

return this;
}
}