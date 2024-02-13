package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://resume.naukri.com/resume-quality-score");
		
		driver.findElement(By.xpath("//span[@class='browse']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		Robot robot=new Robot();
		
		StringSelection filepath=new StringSelection("C:\\Users\\User\\Documents\\SS\\Document.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		System.out.println("File uploaded successfully by using Robot class");
	}

}
