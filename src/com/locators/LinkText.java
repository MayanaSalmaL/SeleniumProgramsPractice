package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//when the text is associated with tag <a> anchor tag
		WebElement forgottonPasswordLink=driver.findElement(By.linkText("Forgotten password?"));
		
		forgottonPasswordLink.click();
		
		Thread.sleep(3000);
		

	}

}
