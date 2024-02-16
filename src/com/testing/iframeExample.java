package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//driver.switchTo().frame("moneyiframe");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("moneyiframe")));
		
		String nse=driver.findElement(By.id("nseindex")).getText();
		
		System.out.println("Nse is : "+nse);
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.linkText("SPORTS")).getTagName());
	}
}