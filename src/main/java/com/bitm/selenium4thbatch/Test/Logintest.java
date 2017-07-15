package com.bitm.selenium4thbatch.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.bitm.selenium4thbatch.Utils.XpathUtils;

public class Logintest {
	
	private WebDriver driver = null;
	 @Test
	public void checkLogin(){
		
		driver.findElement(By.xpath(XpathUtils.Login_Username)).sendKeys("demo");
		driver.findElement(By.xpath(XpathUtils.Input_Passworde)).sendKeys("demo");
		driver.findElement(By.xpath(XpathUtils.BTN_Signin)).click();
		
	}

}
