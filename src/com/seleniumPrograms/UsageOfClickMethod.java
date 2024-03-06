package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClickMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement loginButton=driver.findElement(By.name("login"));
		
		Thread.sleep(3000);
		loginButton.click();
		Thread.sleep(3000);
		driver.manage().window().minimize();		
		

	}

}
