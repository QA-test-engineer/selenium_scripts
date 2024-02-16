package com.testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.findElement(By.id("confirmBox")).click();
								
		Alert ConfirmAlert=driver.switchTo().alert();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		System.out.println(ConfirmAlert.getText());
		
		ConfirmAlert.accept();

		System.out.println(driver.findElement(By.xpath("//div[@id='output']")).getText());
	}

}
