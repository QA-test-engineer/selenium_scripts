package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollByAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		
		WebElement mail=driver.findElement(By.linkText("Purchases.oni@flipkart.com"));
		
		int x=mail.getLocation().x;
		int y=mail.getLocation().y;
		System.out.println(x+"_"+y);
		
		Actions act=new Actions(driver);
		act.scrollByAmount(208,3686).build().perform();
		act.scrollFromOrigin(null, x, y).perform();
		

	}

}
