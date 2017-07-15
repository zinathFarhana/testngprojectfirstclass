package com.bitm.selenium4thbatch.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivermanager {

	static{
		System.setProperty("webdriver.gecko.driver","E:/selenium files/geckodriver-v0.17.0-win64//geckodriver.exe");
	}
	
	public static WebDriver driver = new FirefoxDriver();
	
	private Drivermanager(){
		
	}
}
