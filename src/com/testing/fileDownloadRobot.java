package com.testing;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
	

public class fileDownloadRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		ChromeOptions options=new ChromeOptions();
		
		HashMap<String,Object> pref=new HashMap<>();
		pref.put("plugins.always_open_pdf_externally", true);
		
		options.setExperimentalOption("pref", pref);
		
		driver.manage().window().maximize();
		driver.navigate().to("https://file-examples.com/");
			
		driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")).click();
		driver.findElement(By.xpath("//td[text()='PDF']/following-sibling::td[2]/a")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'Download Sample')]")).click();
		
		
	}

}
