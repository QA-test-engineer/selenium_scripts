package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAction {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		Actions newAct=new Actions(driver);
		WebElement scrolling=driver.findElement(By.xpath("//a[text()='View more demos']"));
		newAct.scrollToElement(scrolling).perform();
		//to scrolling to particular web element using Action class
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0);  //Switching to different frame[0]
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions act = new Actions(driver); // span[text()='Lawrence Block']
		
		WebElement src = driver.findElement(By.xpath("//span[text()='Lawrence Block']"));
		WebElement dest = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));

		act.clickAndHold(src).moveToElement(dest).release().build().perform();

	}

}
