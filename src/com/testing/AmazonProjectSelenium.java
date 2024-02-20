package com.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonProjectSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphones&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

		
		String parentWindow=driver.getWindowHandle();
		WebElement iphone = driver.findElement(By.xpath("//div[text()='₹44,999']"));

		Actions action = new Actions(driver);
				
		action.scrollToElement(iphone).build().perform();
		iphone.click();
		
		Set<String> childWdw=driver.getWindowHandles();
		
		for(String chWd:childWdw) {
			if(!parentWindow.equals(chWd)) {
				driver.switchTo().window(chWd);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
				driver.close();
			}
		}		
		
	}

}
