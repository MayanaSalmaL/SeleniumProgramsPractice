package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CorrectUsageOfSubmitButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//correct usage of submit button
		 driver.get("https://shop-global.malaicha.com/login");
			driver.manage().window().maximize();	
			Thread.sleep(3000);
			WebElement signInButton=driver.findElement(By.xpath("//button[@type='submit']"));
			 signInButton.submit();
		

	}

}
