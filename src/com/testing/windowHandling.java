package com.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> Handles=driver.getWindowHandles();
		for(String childWindows : Handles) {
			System.out.println(childWindows);
			if(!childWindows.equals(parentWindow))
			{
				driver.switchTo().window(childWindows);
				driver.findElement(By.id("firstName")).sendKeys("QA Engineer Uday");
				Thread.sleep(5000);
				driver.close();
			}
			
			driver.switchTo().window(parentWindow);
			driver.findElement(By.id("name")).sendKeys("Vasuki");
			System.out.println(driver.findElement(By.id("name")).getTagName());
			Thread.sleep(5000);	
			driver.close();
		}
		
	}

}
