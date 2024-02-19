package com.testing;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");		 
				
		//Adding cookie 
		Cookie myCookie=new Cookie("testing54321","1234567890");
		driver.manage().addCookie(myCookie);
		
		Set <Cookie> cookies=driver.manage().getCookies();
		System.out.println("Size of cookies: "+cookies.size());
		  
		for(Cookie cookie: cookies) {
			System.out.println(cookie.getName()+" : "+cookie.getValue()+cookie.getValue()); 
		  }
		
		//Deleting Cookie
		driver.manage().deleteCookie(myCookie);
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies: "+cookies.size());
		
		//Deleting All the cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies: "+cookies.size());
		
	}

}
