package com.seleniumPrograms;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithWindows {

	public static void main(String[] args) throws InterruptedException {
		// calling the ChromeDriver constructor and creating the reference of interface
		// webDriver
		// ChromeDriver cd=new ChromeDriver();//it is correct but not as per OOAD
		// principle
		// loading the empty ChromDriver

		WebDriver driver = new ChromeDriver();

		/*
		 * Predefined get method valid string as argument with return type as void from
		 * interface WebDriver
		 */

		/*
		 * pre condition because initially the automated window will not be in maximized
		 * and its return type is void
		 */
		Thread.sleep(2000);
		driver.manage().window().maximize();

		/*
		 * Method mapping manage method present in Options interface and manager return
		 * type is options In options we can perform 3 operations cookies method, window
		 * method, timeouts method
		 */

		/*
		 * using window method we can chain or map the other methods like
		 * minimize,maximize,fullscreen,getPosition,setPosition,getSize,setSize
		 */
		/*
		 * window method the return type is window interface, options window is
		 * performed on child window not on parent window
		 */
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);//in new chrome window below url will get open
	
		
		driver.get("https://www.dassault-aviation.com/en");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/");
		
		Set<String> allWindowIds=driver.getWindowHandles();
		
		System.out.println(allWindowIds.size());
		
		for(String wid: allWindowIds)
		{
			String wIdTitle=driver.switchTo().window(wid).getTitle();
			
			System.out.println(wIdTitle);
			if(wIdTitle.equals("Facebook – log in or sign up"))
			{
				System.out.println("we are on facebook url");
			}
			else if(wIdTitle.equals("Dassault Aviation, a major player to aeronautics"))
			{
				System.out.println("we are on aviation url");
			}
			else
			{
				System.out.println("we are on myntra url");
			}
		}


	}

}
