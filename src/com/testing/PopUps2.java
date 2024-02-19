package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUps2 {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");	
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).sendKeys("8957644510");
		
		Thread.sleep(2000);
		driver.close();
	}

}
