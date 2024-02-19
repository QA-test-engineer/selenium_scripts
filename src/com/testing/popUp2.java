package com.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popUp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				
		Thread.sleep(3000);
		driver.findElement(By.name("proceed")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text=alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		}
		else {
			System.out.println("in-correct alert message");
		}
		
		Thread.sleep(2000);
		alert.accept();
		
		Thread.sleep(2000);
		driver.close();
	}

}
