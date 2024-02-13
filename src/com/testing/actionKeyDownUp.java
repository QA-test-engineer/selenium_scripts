package com.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionKeyDownUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bugbug.io/blog/software-testing/best-selenium-practice-websites/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Accepting cookies option
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		WebElement openlinktab=driver.findElement(By.xpath("//a[text()='Selenium Cheat Sheet']"));
		
		//driver.switchTo().defaultContent();
		
		Actions actions=new Actions(driver);
		actions.moveToElement(openlinktab).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		
		System.out.println("Executed script");
	}

}
