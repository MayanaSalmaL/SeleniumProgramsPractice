package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAndPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement kannadaLink=driver.findElement(By.linkText("ಕನ್ನಡ"));
		
		kannadaLink.click();
		/*when to go for partial link text ---> 
		when the link text is too length and when the link text is partially dynamic*/
		Thread.sleep(3000);
		WebElement englishLink=driver.findElement(By.partialLinkText("English"));//English (UK)
		englishLink.click();

	}

}
