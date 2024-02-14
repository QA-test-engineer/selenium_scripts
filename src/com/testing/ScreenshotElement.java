package com.testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement logo=driver.findElement(By.xpath("//a[text()='000-800-919-1694']"));

		File temp = logo.getScreenshotAs(OutputType.FILE);

		try {
			Files.copy(temp, new File("C:\\Users\\User\\Documents\\SS\\Image.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File myfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(myfile, new File("C:\\Users\\User\\Documents\\SS\\Image.png"));

	}

}
