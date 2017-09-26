package com.sqa.vk.core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.sqa.vk.adactin.*;

public class AdactinHomePage extends BasicPage {

	@FindBy(id = "username")
	private WebElement usernameField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(id = "login")
	private WebElement loginButton;

	public AdactinHomePage(BasicTest test) {
		super(test);
	}

	public SearchHotelPage login(String username, String password) {
		takeScreenshot();
		this.usernameField.clear();
		this.usernameField.sendKeys(username);
		this.passwordField.clear();
		this.passwordField.sendKeys(password);
		takeScreenshot("AdactinPreLogin");
		this.loginButton.click();
		takeScreenshot("AdactinPostLogin");
		return new SearchHotelPage();
	}
}
