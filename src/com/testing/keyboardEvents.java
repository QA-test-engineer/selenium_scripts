package com.testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		
		Actions enter=new Actions(driver);
		enter.sendKeys(Keys.ENTER).perform();
	

	}

}
