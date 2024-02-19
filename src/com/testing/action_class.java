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
		//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
		//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
		//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
		//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
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
