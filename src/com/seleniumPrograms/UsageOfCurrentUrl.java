package com.seleniumPrograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsageOfCurrentUrl {

	public static void main(String[] args) {
		// calling the ChromeDriver constructor and creating the reference of interface webDriver
		//ChromeDriver cd=new ChromeDriver();//it is correct but not as per OOAD principle
		//loading the empty ChromDriver

		WebDriver driver=new ChromeDriver();
		
		/*Predefined get method valid string as argument with return type as void
		from interface WebDriver*/
		
		driver.get("https://www.selenium.dev/");
		
		
		/*getCurrentUrl method present in WebDriver interface 
		is non parameterized method with return type as string*/
		String actualCurrentUrl=driver.getCurrentUrl();
		
		String expectedCurrentUrl="https://www.selenium.dev/";
		
		System.out.println(actualCurrentUrl);
		
		
		
		//Comparison of two strings with equals method - comparing actual with expected outputs
         
		
		if(actualCurrentUrl.equals(expectedCurrentUrl))
		{
			System.out.println("Test case is passed for getcurrenturl: "+ actualCurrentUrl);
		}
		else
		{
			System.out.println("Test case is failed for getcurrenturl: "+ actualCurrentUrl);
		}
	}

}
