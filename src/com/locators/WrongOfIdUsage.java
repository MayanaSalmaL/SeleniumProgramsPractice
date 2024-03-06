package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongOfIdUsage {

	public static void main(String[] args) {
		// id attribute value if it is dynamic
		//id attribute if it is not present
		//id attribute value if it is duplicate
		//id attribute value is not present
		//org.openqa.selenium.NoSuchElementException
		//selenium---runtime--unchecked exception
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		WebElement loginButton=driver.findElement(By.id("u_0_5_MQ"));
		loginButton.click();

	}

}
