package com.seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProgramGetMethod {

	public static void main(String[] args) {
		// calling the ChromeDriver constructor and creating the reference of interface webDriver
		//ChromeDriver cd=new ChromeDriver();//it is correct but not as per OOAD principle
		//loading the empty ChromDriver
		WebDriver driver=new ChromeDriver(); //according to OOAD principle
		
		/*Predefined get method valid string as argument with return type as void
		from interface WebDriver*/
		driver.get("https://www.selenium.dev/");
		
		
		/* org.openqa.selenium.InvalidArgumentException - get method 
		---run time unchecked exception will occur*/
		
		driver.get(".selenium.dev/");
		

	}

}
