package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class windowsMultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.id("newWindowBtn")).click();
		driver.findElement(By.id("newWindowBtn")).click();
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> childWindows=driver.getWindowHandles();
		for(String var_chldWnd: childWindows) {
			
			if(!parentWindow.equals(var_chldWnd)) {
				driver.switchTo().window(var_chldWnd);
				driver.manage().window().maximize();
				Thread.sleep(4000);
				driver.findElement(By.id("firstName")).sendKeys("QA");
				driver.findElement(By.id("lastName")).sendKeys("Uday");
				
				Thread.sleep(3000);
				driver.manage().window().minimize();
				driver.close();
			}
			
		}
		driver.switchTo().window(parentWindow);
		Thread.sleep(4000);
		driver.close();
		
	}

}
