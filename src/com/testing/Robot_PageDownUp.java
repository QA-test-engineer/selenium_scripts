package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_PageDownUp {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);  //pressing key
		robot.keyRelease(KeyEvent.VK_DOWN);  //it is important to release the key after pressing 
		robot.keyPress(KeyEvent.VK_DOWN);  //interactions are same as humans in selenium script
		robot.keyRelease(KeyEvent.VK_DOWN);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);

	}

}
