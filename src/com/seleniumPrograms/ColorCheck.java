package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColorCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		WebElement loginButton=driver.findElement(By.name("login"));
		
		String colorOfButton=loginButton.getCssValue("background-color");
		System.out.println(colorOfButton);
		String hexaValueOfColour=Color.fromString(colorOfButton).asHex();
		
		System.out.println(hexaValueOfColour);
		
		String fontFamily=loginButton.getCssValue("font-family");
		
		System.out.println(fontFamily);

	}

}
