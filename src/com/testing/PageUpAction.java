package com.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageUpAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");

		WebElement linktxt = driver.findElement(By.linkText("Become a Seller"));
		Actions act = new Actions(driver);
		act.scrollToElement(linktxt).perform();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement pageup = driver.findElement(By.linkText("Best of Electronics"));
		Actions act2 = new Actions(driver);
		act2.scrollToElement(pageup).perform();

	}

}
