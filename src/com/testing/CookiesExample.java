package com.testing;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//returns all the cookies in Set of Cookie class type object
 		Set <Cookie> cookies=driver.manage().getCookies();
		System.out.println("Size of cookies: "+cookies.size());
		
		for(Cookie cookie: cookies) {
			System.out.println(cookie.getName()+" : "+cookie.getValue()+cookie.getValue());
		}
			
		//returns specific cookie name as per the specified argument
		System.out.println(driver.manage().getCookieNamed("vw"));
						
	}

}
