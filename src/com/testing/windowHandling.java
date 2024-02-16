package com.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);
		
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> Handles=driver.getWindowHandles();
		for(String handle : Handles) {
			System.out.println(handle);
		}
		
	}

}
