package com.testing;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				ChromeOptions options=new ChromeOptions();
				options.addArguments("disable-notifications");
				
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://www.justdial.com/");	


	}

}
