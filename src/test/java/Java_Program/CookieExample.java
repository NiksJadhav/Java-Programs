package Java_Program;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieExample 
{
	public static void main(String[] args) 
	{
		//getCookies()
		//getCookieName()
		//addCookie()
		//deleteCookies()
		//deleteCookieName()
		//deleteAllCookie()
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//getCookies()
		Set <Cookie> cookielist=driver.manage().getCookies();
		System.out.println("Size of Cookies="+cookielist.size());
		
		for(Cookie ch: cookielist)
		{
			System.out.println(ch.getName()+":"+ch.getValue());
		}
		System.out.println("------------------------------");
		
		//getCookieName()
		System.out.println("Cookie Name:"+driver.manage().getCookieNamed("AEC"));
		
		System.out.println("------------------------------");
		
		//addCookie()
		Cookie cookie=new Cookie("Nikita","www.google.com");
		driver.manage().addCookie(cookie);
		cookielist=driver.manage().getCookies();
		System.out.println("Size of Cookies="+cookielist.size());
		
		for(Cookie ch: cookielist)
		{
			System.out.println(ch.getName()+":"+ch.getValue());
		}
		System.out.println("------------------------------");
		
		//deleteCookie()
		driver.manage().deleteCookie(cookie);
		cookielist=driver.manage().getCookies();
		System.out.println("Size of Cookies="+cookielist.size());
		
		for(Cookie ch: cookielist)
		{
			System.out.println(ch.getName()+":"+ch.getValue());
		}
		System.out.println("------------------------------");
		
		//deleteCookieName()
		driver.manage().deleteCookieNamed("NID");
		cookielist=driver.manage().getCookies();
		System.out.println("Size of Cookies="+cookielist.size());
		
		for(Cookie ch: cookielist)
		{
			System.out.println(ch.getName()+":"+ch.getValue());
		}
		System.out.println("------------------------------");
		
		//deleteAllCookies()
		driver.manage().deleteAllCookies();
		cookielist=driver.manage().getCookies();
		System.out.println(",Size of Cookies="+cookielist.size());

		driver.close();
		
	}

}
