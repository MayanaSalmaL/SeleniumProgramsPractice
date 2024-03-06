package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopAlignment {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/identify");
	
	Thread.sleep(3000);
	
	WebElement emailTextField=driver.findElement(By.xpath("//input[@name='email']"));
	int emailYAxis=emailTextField.getLocation().getY();
	System.out.println("email text field y axis as field is arranged horizontally on login page"+ emailYAxis);
	
	WebElement passwordTextField=driver.findElement(By.name("pass"));//container is present id="passContainer" so not taking id going for name
	int passwordYAxis=passwordTextField.getLocation().getY();
	System.out.println("password text field y axis "+passwordYAxis);
	
	if(emailYAxis==passwordYAxis)
	{
		System.out.println("Top alignment scenario  verified");
	}
	else
	{
		System.out.println("Top alignment scenario is not verified");
	}
	Thread.sleep(3000);
	driver.quit();
	}

}
