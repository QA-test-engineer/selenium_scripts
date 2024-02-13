package com.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://dhtmlx.com/docs/products/dhtmlxTree/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Actions act = new Actions(driver); // span[text()='Lawrence Block']

		WebElement src = driver.findElement(By.xpath("//span[text()='Lawrence Block']"));
		WebElement dest = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));

		act.clickAndHold(src).moveToElement(dest).release().build().perform();

	}

}
