package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheEmailAndPasswordSize {
	
public static void ww()
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailtextField=driver.findElement(By.name("email"));
		
		int height=emailtextField.getSize().getHeight();
		
		System.out.println(height);
		
		int width=emailtextField.getSize().getWidth();
		System.out.println(width);
		
WebElement passwordtextField=driver.findElement(By.name("pass"));
		
		int heightPassword=passwordtextField.getSize().getHeight();
		
		System.out.println(heightPassword);
		
		int widthPassword=passwordtextField.getSize().getWidth();
		System.out.println(widthPassword);
		
		if(height==heightPassword && width == widthPassword)
		{
			System.out.println("Height and width are correct");
		}
		else
		{
			System.out.println("Height and width are incorrect");
		}
		
		
		
		

	}

}
