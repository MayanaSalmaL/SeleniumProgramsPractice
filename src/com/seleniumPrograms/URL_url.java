package com.seleniumPrograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class URL_url {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver =new ChromeDriver();
		
driver.manage().window().maximize();

driver.get("https://www.dassault-aviation.com/en/");

Thread.sleep(3000);
//To store the main URL
URL mainURL=new URL("https://www.dassault-aviation.com/en/");

Thread.sleep(3000);

URL civilURL =new URL(mainURL,"civil/");

Thread.sleep(3000);
driver.navigate().to(civilURL);
Thread.sleep(3000);
URL passionURL =new URL(mainURL,"passion/");
Thread.sleep(3000);
driver.navigate().to(passionURL);

Thread.sleep(3000);
URL defenseURL =new URL(mainURL,"defense/");
driver.navigate().to(defenseURL);
Thread.sleep(3000);
driver.manage().window().minimize();
	}

}
