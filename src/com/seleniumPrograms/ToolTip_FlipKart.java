package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip_FlipKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
	
		
	WebElement toolTipElement=driver.findElement(By.xpath("//img[contains(@src,'https://static-assets-web.flixcart.com/')]"));
	
	String toolTipText=toolTipElement.getAttribute("title");//It will give the value of that attribute: title
	//return type of getAttribute is String and coming from WebElement
	System.out.println(toolTipText);
	
	

		
		
		
		

	}

}
