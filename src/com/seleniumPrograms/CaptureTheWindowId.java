package com.seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheWindowId {

	public static void main(String[] args) {
		// calling the ChromeDriver constructor and creating the reference of interface webDriver
				//ChromeDriver cd=new ChromeDriver();//it is correct but not as per OOAD principle
				//loading the empty ChromDriver

				WebDriver driver=new ChromeDriver();
				
				/*Predefined get method valid string as argument with return type as void
				from interface WebDriver*/
				
				driver.get("https://www.selenium.dev/");
				
				/*getWindowHandle is predefined method in interface WebDriver 
				with return type as String and non parametrized - unique Ids it will fetch*/
				
				String windowId=driver.getWindowHandle();
				
				System.out.println(windowId);

	}

}
