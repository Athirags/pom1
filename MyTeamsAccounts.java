package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.projectspecificmethod;

public class MyTeamsAccounts extends projectspecificmethod{
	public MyTeamsAccounts(RemoteWebDriver inwardDriver) {
		this.driver=inwardDriver;
	}
	public  findAccounts ClickFindaccounts() {
		driver.findElement(By.linkText("Find Accounts")).click();
		return new findAccounts(driver);
		}

	public  CreateAccount ClickCreateAccounts() {
		 driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccount(driver);
		}
}
