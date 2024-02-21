package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartProjectSelenium {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphones&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

		
		Thread.sleep(2000);
		String parentWindow=driver.getWindowHandle(); //getting parent Window
		
		WebElement iphone = driver.findElement(By.xpath("//div[text()='₹44,999']"));

		//Scrolling page to iphone 
		Actions action = new Actions(driver);				
		action.scrollToElement(iphone).build().perform();
		
		Thread.sleep(2000);
		iphone.click();
		
		Set<String> childWdw=driver.getWindowHandles();
		
		for(String chWd:childWdw) {
			if(!parentWindow.equals(chWd)) {
				driver.switchTo().window(chWd);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//Scrolling till input pincode text field
				Actions scrollToElement=new Actions(driver);
				scrollToElement.scrollToElement(driver.findElement(By.id("pincodeInputId"))).build().perform();
								
				Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				
				Thread.sleep(2000);				
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				
				Thread.sleep(2000);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("pincodeInputId")).sendKeys("12345");
				
				Thread.sleep(2000);
				WebElement AddCartbutton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
				scrollToElement.scrollToElement(AddCartbutton).perform();
				Thread.sleep(2000);
				AddCartbutton.click();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				Thread.sleep(2000);
				
				WebElement needHelp=driver.findElement(By.linkText("Help Center"));
				scrollToElement.scrollToElement(needHelp).perform();
				
				Thread.sleep(2000);
				//finding and clicking on Place Order button
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
								
				Thread.sleep(2000);
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(2000);
		WebElement loginOption=driver.findElement(By.xpath("//a[text()='Mobiles' and @class='_2whKao']"));
		Actions scroll=new Actions(driver);
		scroll.scrollToElement(loginOption).build().perform();
		
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
