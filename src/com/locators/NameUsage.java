package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameUsage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		//name attribute value if it is dynamic
		//name attribute is not present
		//name attribute value is duplicate
		//if name attribute value is not present
		//org.openqa.selenium.NoSuchElemenmtExcelption
		//Selenium---run time---unchecked exception
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement emailTextField=driver.findElement(By.name("email"));
		emailTextField.sendKeys("abc@gmail.com");

	}

}
