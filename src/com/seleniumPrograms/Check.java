package com.seleniumPrograms;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com");
		
		Thread.sleep(3000);
		
		Set<String> allWIds=driver.getWindowHandles();
		System.out.println(allWIds);
		for(String wid: allWIds)
		{
			String widTitle=driver.switchTo().window(wid).getTitle();
			
			System.out.println(widTitle);
			if(widTitle.equals("Facebook – log in or sign up"))
			
			{
				//nothing to do
			}
			
			else if(widTitle.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"))
			{
				Dimension definedSize=new Dimension(400,200);
				driver.manage().window().setSize(definedSize);
				
				Thread.sleep(3000);
				Point definedPosition=new Point(150,250);
				driver.manage().window().setPosition(definedPosition);
				
				
				
			}
			
			
		}
		
		/*Post condition, windows will get close and it will not be running in
		 *  background in task manager menu  
		where as close method still in background window will be running in task bar menu*/
		//Thread.sleep(3000);
		//driver.close();//only current window will get close
		Thread.sleep(3000);
		driver.quit();
	}

}
