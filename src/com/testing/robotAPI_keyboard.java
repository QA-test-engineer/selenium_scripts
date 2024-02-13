package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotAPI_keyboard {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		robot.keyPress(KeyEvent.VK_TAB);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		robot.keyPress(KeyEvent.VK_TAB);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		robot.keyPress(KeyEvent.VK_TAB);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		robot.keyPress(KeyEvent.VK_TAB);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//robot.keyPress(KeyEvent.VK_ENTER);
	}

}
