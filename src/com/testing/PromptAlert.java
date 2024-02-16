package com.testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.findElement(By.id("promptBox")).click();
								
		Alert promptAlert=driver.switchTo().alert();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("QA Testing");
		promptAlert.accept();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());

	}

}
