package com.locators;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteAndRelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		////Absolute xpath for facebook - email textfield
	//	/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement emailTextField=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		emailTextField.sendKeys("aaa@gmail.com");
		//Absolute x path for create account nutton in facebook
		WebElement createAnAccount=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/form/div[5]/a"));
		createAnAccount.click();
		
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement groccery=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a"));
		//or 
		//WebElement groccery_withoutIndex=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/a"));
		groccery.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(6000);
		WebElement flipkartLogin=driver.findElement(By.xpath("/html/body/div[3]/div/span"));
		Thread.sleep(3000);
		flipkartLogin.click();
		
		WebElement flipkartLogo=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div/div/a/picture/img"));
		Thread.sleep(6000);
	
		flipkartLogo.click();
	
		driver.quit();
		
		///html/body/div[3]/div/span
	
		//driver.switchTo().newWindow(WindowType.TAB);
				//Thread.sleep(3000);
		
		
		
		
		

		
	}

}
