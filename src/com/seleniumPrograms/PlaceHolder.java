package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement placeHolderElement=driver.findElement(By.id("email"));
		
		String placeHolderText=placeHolderElement.getAttribute("placeholder");
		
		System.out.println(placeHolderText);
		driver.manage().window().minimize();
		driver.quit();
		}

}
