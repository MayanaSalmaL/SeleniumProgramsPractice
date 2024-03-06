package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("username"));
		
		String text=element.getAttribute("value");
		System.out.println(text);
		
		if(text.isEmpty())
		{
			element.sendKeys("ADMIN");
		}
		
		else
		{
			element.clear();
			Thread.sleep(3000);
			element.sendKeys("ADMIN-admin");
			
		}
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.quit();

	}

}
