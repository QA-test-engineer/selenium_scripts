package com.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//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

		System.setProperty("webdriver.chromedriver.driver",
				"C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		//driver.findElement(By.linkText("Accept Cookies")).click();
		String check=driver.findElement(By.linkText("Solutions")).getText();
		System.out.println(check);
		
		driver.findElement(By.linkText("Solutions")).click();
		WebElement solutions=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(solutions).build().perform();
	}

}
