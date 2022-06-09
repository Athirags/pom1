package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.projectspecificmethod;

public class NewviewLead extends projectspecificmethod{
	public NewviewLead(RemoteWebDriver inwardDriver) {
		this.driver=inwardDriver;
	}
	public EditLead clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
	    return new EditLead(driver);
	}
	public myLeads deletelead() {
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Delete']")).click();
		return new myLeads(driver);
	}
}