package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAlignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement emailTextField=driver.findElement(By.id("email"));
		
		int emailTextFieldXAxis=emailTextField.getLocation().getX();
		System.out.println("vertically arranged so xaxis"+ emailTextFieldXAxis);
		
		WebElement passwordTextField=driver.findElement(By.id("passContainer"));
		
		int passwordTextFieldXAxis=passwordTextField.getLocation().getX();
		System.out.println("vertically arranged so xaxis"+ passwordTextFieldXAxis);
		
		if(emailTextFieldXAxis==passwordTextFieldXAxis)
		{
			System.out.println("Scenario verfied because both fields x axes are same");
		}
		else
			System.out.println("Scenario not verfied because both fields x axes are not same");
		
		driver.manage().window().minimize();
		driver.quit();
	}
	


}
