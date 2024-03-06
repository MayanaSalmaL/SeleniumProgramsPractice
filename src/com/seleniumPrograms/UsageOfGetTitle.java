package com.seleniumPrograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsageOfGetTitle {

	public static void main(String[] args) {
		
		// calling the ChromeDriver constructor and creating the reference of interface webDriver
				//ChromeDriver cd=new ChromeDriver();//it is correct but not as per OOAD principle
				//loading the empty ChromDriver
		
		WebDriver driver=new ChromeDriver();//according to OOAD principle
		
		/*Predefined get method valid string as argument with return type as void
		from interface WebDriver*/
		driver.get("https://www.selenium.dev/");
		
		
		/*getTitle method present in WebDriver 
		interface  is non parameterized method with return type as string 
		*/
		String seleniumActualTitle=driver.getTitle();
		String seleniumExpectedTitle="Selenium";
		
		System.out.println(seleniumActualTitle);
		
		//Comparison of two strings with equals method - comparing actual with expected outputs
		if(seleniumActualTitle.equals(seleniumExpectedTitle))
		{
			System.out.println("Test case is passed for selenium home page: "+ seleniumActualTitle );
		}
		else
		{
			System.out.println("Test Case is failed for selenium home page: "+ seleniumActualTitle);
		}
		
		
		

	}

}
