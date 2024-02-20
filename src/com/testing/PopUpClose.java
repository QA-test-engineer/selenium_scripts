package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpClose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Login/ Sign Up']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='multiform' and @id='multiform']")).sendKeys("1234567890");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='absolute top-0 right-0']")).click();
		
	}

}
