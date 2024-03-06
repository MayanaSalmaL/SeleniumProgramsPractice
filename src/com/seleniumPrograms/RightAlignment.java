package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightAlignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement emailTextField=driver.findElement(By.id("email"));
		
		int emailTextFieldXAxis=emailTextField.getRect().getX();
		int emailTextFieldWidth=emailTextField.getRect().getWidth();
		int emailRightAlignment=emailTextFieldXAxis+emailTextFieldWidth;
		
		
		System.out.println("vertically arranged so xaxis"+ emailRightAlignment);
		
		WebElement passwordTextField=driver.findElement(By.id("passContainer"));
		int passwordTextFieldXAxis=passwordTextField.getRect().getX();
		int passwordTextFieldWidth=passwordTextField.getRect().getWidth();
		int passwordRightAlignment=passwordTextFieldXAxis+emailTextFieldWidth;
		
		System.out.println("vertically arranged so xaxis"+ passwordRightAlignment);
		
		if(emailRightAlignment==passwordRightAlignment)
		{
			System.out.println("scenario is verified and equal");
		}
		else
			System.out.println("Scenario is not verified not equal");
		driver.manage().window().minimize();
		driver.quit();

	}

}
