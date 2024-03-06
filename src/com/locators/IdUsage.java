package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdUsage {

	public static void main(String[] args) throws InterruptedException {
		/*id can be dynamic but in most of the scenarios 
		it will not be duplicated in some scenarios it can be duplicated*/
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wwww.facebook.com");
		
		/*login button id is dynamic, firstime noted and also
		*when it will be dynamic or duplicated in the scenario if id
		contains of special characters combination and sometimes id only will not be present*/
		
		/*<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" 
				name="login" data-testid="royal_login_button" 
				type="submit" id="u_0_5_hb" fdprocessedid="10wbdm">Log in</button>*/
		
		//after refresh id is getting change 
		/*<button value="1" 
		 * class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" 
		 * data-testid="royal_login_button" type="submit" 
		 * id="u_0_5_a0" fdprocessedid="yh3qhk">Log in</button>
		 * 
		 *  <button value="1" 
		 *  class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" 
		 *  name="login" data-testid="royal_login_button" type="submit"
		 *   id="u_0_5_bB" fdprocessedid="5l1vee">Log in</button>*/
		
		/*if we cannot inspect while right click on e;lement of webpage then the short cut key is 
		ctrl+shift+i*/
		//to see dom(document object modle) page
		
		/*if we cant go for id address in case of dynamic or duplicate 
		then based on priority of locators go to other option id, 
		name,linkText,partialLinkText css-selector,x-path 
		(class and tagName are higher then we wont go for this*/
		
		Thread.sleep(3000);
		
		//run time unchecled ---selenium exception
		/*org.openqa.selenium.NoSuchElementException: no such element: 
		Unable to locate element: {"method":"css selector","selector":"#emai"}*/
		//WebElement userName=driver.findElement(By.id("emai")); 
		
		
		WebElement userName=driver.findElement(By.id("email")); 
		userName.sendKeys("sultana.salma913@gmail.com");
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.quit();
	


	}

}
