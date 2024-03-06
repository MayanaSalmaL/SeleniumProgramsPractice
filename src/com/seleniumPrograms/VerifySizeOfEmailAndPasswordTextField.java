package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySizeOfEmailAndPasswordTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement emailTextField=driver.findElement(By.id("email"));
		
		int heightOfEmailTextField=emailTextField.getSize().getHeight();
		System.out.println("Height of email text field vertically arranged "+heightOfEmailTextField);
		int widthOfEmailTextField=emailTextField.getSize().getWidth();
		System.out.println("width of email text field vertically arranged "+widthOfEmailTextField);
		WebElement passwordTextField=driver.findElement(By.id("passContainer"));//id=passContainer here, container is present so we go for containerbecause whole field by this only it is getting selected
		int heightOfPasswordTextField=passwordTextField.getSize().getHeight();
		System.out.println("Height of password text field vertically arranged "+heightOfPasswordTextField);
		
		
		int widthOfPasswordTextField=emailTextField.getSize().getWidth();
		System.out.println("width of password text field vertically arranged "+widthOfPasswordTextField);
		
		if(heightOfEmailTextField==heightOfPasswordTextField && widthOfEmailTextField==widthOfPasswordTextField)
		{
			System.out.println("Scenario is verified and axis and its size is same of both fields");
		}
		else
			System.out.println("size is not same so scenario is not verified");
		
		driver.manage().window().minimize();
		driver.quit();
		

	}

}
