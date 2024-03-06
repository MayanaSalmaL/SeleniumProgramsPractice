package com.seleniumPrograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
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
		driver.get("https://www.dassault-aviation.com/en/");
		
		//driver.get("https://www.dassault-aviation.com/en/space");

		Thread.sleep(2000);

		/*
		 * there are two to methods with string Url as one parameter and another as URL
		 * as one parameter to navigate
		 */
		
		//to strong with parameter as string url void is return type
		
		driver.navigate().to("https://www.dassault-aviation.com/en/group");
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/space");
		//driver.navigate().to("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.dassault-aviation.com/en/defense");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		//add the keyword throw and exception is MalformedException if URL is wrong 
		URL mainURL=new URL("https://www.dassault-aviation.com/en/");
		URL civilURL=new URL(mainURL,"civil/");
		driver.navigate().to(civilURL);
		
		
		
		

	}

}
