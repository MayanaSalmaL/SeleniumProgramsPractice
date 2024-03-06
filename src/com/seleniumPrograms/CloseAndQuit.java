package com.seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		/*Post condition, windows will get close and it will not be running in
		 *  background in task manager menu  
		where as close method still in background window will be running in task bar menu*/
		Thread.sleep(3000);
		driver.close();//only current window will get close
		Thread.sleep(3000);
		driver.quit();
	}

}
