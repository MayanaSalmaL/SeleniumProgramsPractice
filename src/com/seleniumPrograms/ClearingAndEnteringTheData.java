package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearingAndEnteringTheData {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
		WebElement userNameField=driver.findElement(By.id("username"));
		Thread.sleep(3000);
		userNameField.clear();
		Thread.sleep(3000);
		userNameField.sendKeys("abc");
		WebElement password=driver.findElement(By.id("password"));
		Thread.sleep(3000);
		password.sendKeys("abc");
		Thread.sleep(3000);
		password.clear();

	}

}
