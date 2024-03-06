package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfSubmitButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://shop-global.malaicha.com");
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		
		
		try
		{
		
		WebElement registerButton=driver.findElement(By.xpath("//button[text()='Register']"));
		 registerButton.submit();
		 
		 Thread.sleep(3000);
		 
		 
		
		}
		catch(Exception e)
		{
			System.out.println("As there is no form tag, if form tag is present there is no button "
					+ "tag so exception");
		}
		
		
		
//org.openqa.selenium.NoSuchElementException
	}

}
