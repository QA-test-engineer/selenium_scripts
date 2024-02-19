package com.testing;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowTabHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.id("newTabBtn")).click();
		System.out.println(parentWindow);
		
		Set<String> childTab=driver.getWindowHandles();
		for(String chldTab: childTab) {
			if(!chldTab.equals(parentWindow)) {
				driver.switchTo().window(chldTab);
				break;
			}
		}
		
		driver.findElement(By.id("alertBox")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(4000);
		alert.accept();
		driver.close();
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("name")).sendKeys("QA Engineer");
		
		Thread.sleep(9000);
				
	}
	
}
