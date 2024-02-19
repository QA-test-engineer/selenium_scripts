package com.testing;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");	
		
		Set<Cookie> allCookies=driver.manage().getCookies();
		System.out.println(allCookies.size());
		
		for(Cookie myCookies: allCookies) {
			System.out.println(myCookies.getName());
		}
		
		driver.manage().deleteCookieNamed("skin");	
		
		allCookies=driver.manage().getCookies();			
		System.out.println(allCookies.size());		
		
		for(Cookie myCookies: allCookies) {
			System.out.println("Deleted Cookie: "+myCookies.getName());
		}
		
		driver.manage().deleteAllCookies();
		
		allCookies=driver.manage().getCookies();
		System.out.println(allCookies.size());
		
	}

}
