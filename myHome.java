package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.projectspecificmethod;

public class myHome extends projectspecificmethod{
	public myHome(RemoteWebDriver inwardDriver) {
		this.driver=inwardDriver;
	}
public myLeads clickleads() {
	driver.findElement(By.linkText("Leads")).click();
	return new myLeads(driver);
}
public MyTeamsAccounts clickAccounts()  {

	driver.findElement(By.linkText("Accounts")).click();
     return new MyTeamsAccounts(driver);
}



}
