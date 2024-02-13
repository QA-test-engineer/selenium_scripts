package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Keyboard {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co");
		driver.findElement(By.linkText("Courses")).click();
		
		Robot robot=new Robot();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		robot.keyPress(KeyEvent.VK_DOWN);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		robot.keyPress(KeyEvent.VK_TAB);
		System.out.println("a");
		
		robot.keyPress(KeyEvent.VK_TAB);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("b");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("c");
		
		//driver.findElement(By.xpath("//div[@class='search_click mr-auto ga-event-search-click desktop_click_search']")).click();
		
		//WebElement ele=driver.findElement(By.xpath("//div[@class='search_click mr-auto ga-event-search-click desktop_click_search']"));
		
		WebElement ele=driver.findElement(By.linkText("DevOps"));
		int x=ele.getLocation().x;
		int y=ele.getLocation().y;
		robot.mouseMove(x,y);
		
		System.out.println("d");
		
	}
}
