package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandling {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opera.com/");
		
		
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[text()='Accept cookies']")).click();
		  
		  Thread.sleep(2000); driver.close();
		 
	}

}
