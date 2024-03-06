package com.seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_PreAndPostConditions {

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
		driver.get("https://www.selenium.dev/");

		/*
		 * post condition after window is maximized we can minimized using minimize
		 * method and its return type is void
		 */
		Thread.sleep(2000);
		driver.manage().window().minimize();

		Thread.sleep(2000);

		/*
		 * Thread is class in java and sleep is method static method with parameter as
		 * in milliseconds ,method shadowing
		 */
		// fullScreen method is usual screen of that particular website and browser url
		// will be not visible

		driver.manage().window().fullscreen();

		// standards of selenium are maximizing,minimizing

	}

}
