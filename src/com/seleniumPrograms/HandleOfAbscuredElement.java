package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleOfAbscuredElement {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();	
	Thread.sleep(3000);
	WebElement dissmisLink=driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]/../input[@data-action-type='DISMISS']"));
	Thread.sleep(3000);
	dissmisLink.click();
	
	//span[contains(text(),'Dismiss')]/../input[@data-action-type='DISMISS']
	
	WebElement customerServiceLink=driver.findElement(By.xpath("//div/a[text()='Customer Service']"));
	
	customerServiceLink.click();
	}

}
