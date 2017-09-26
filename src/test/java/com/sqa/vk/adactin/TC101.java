package com.sqa.vk.adactin;

import org.testng.annotations.*;

import com.sqa.vk.core.*;

public class TC101 extends AdactinTest {

	@Test
	public void testTC101() throws InterruptedException {
		AdactinHomePage homePage = new AdactinHomePage(this);
		homePage.login(this.getProp("username"), this.getProp("password"));
	}
}
