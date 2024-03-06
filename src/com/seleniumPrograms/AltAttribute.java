package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AltAttribute {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//a[@aria-label='Grocery']//img"));
		
		String elementAltValue=element.getAttribute("alt");
		System.out.println(elementAltValue);
		
		driver.manage().window().minimize();
		driver.quit();

	}

}
