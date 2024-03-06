package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignupSizeCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(9000);
		
		WebElement createNewAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createNewAccount.click();
		Thread.sleep(3000);
			WebElement firstNameTextField=driver.findElement(By.xpath("//input[@name='firstname']"));
	int heightOfFirstNameField=firstNameTextField.getSize().getHeight();
			
			System.out.println("height of firstName text field "+heightOfFirstNameField);
			
	int widthOfFirstNameField=firstNameTextField.getSize().getWidth();
			
			System.out.println("width of firstName text field "+widthOfFirstNameField);
			Thread.sleep(3000);
		
		WebElement surNameTextField=driver.findElement(By.xpath("//div[@id='fullname_field']/div/div/div//input[@name='lastname']"));
		
int heightOfSurNameField=surNameTextField.getSize().getHeight();
		
		System.out.println("height of surName text field "+heightOfSurNameField);
		
int widthOfSurNameField=surNameTextField.getSize().getWidth();
		
		System.out.println("width of surName text field "+widthOfSurNameField);
		Thread.sleep(3000);
		WebElement emailTextField=driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));
		
int heightOfEmailField=emailTextField.getSize().getHeight();
		
		System.out.println("height of email text field "+heightOfEmailField);
		
int widthOfEmailField=emailTextField.getSize().getWidth();
		
		System.out.println("width of email text field "+widthOfEmailField);
		Thread.sleep(3000);
		WebElement passwordTextField=driver.findElement(By.xpath("//input[@data-type='password']"));
		
		int heightOfPasswordField=passwordTextField.getSize().getHeight();
				
				System.out.println("height of password text field "+heightOfEmailField);
				
		int widthOfPasswordField=passwordTextField.getSize().getWidth();
				
				System.out.println("width of surName text field "+widthOfPasswordField);
				
				Thread.sleep(3000);
				
				
				if(heightOfFirstNameField==heightOfSurNameField && widthOfFirstNameField==widthOfSurNameField && heightOfEmailField==heightOfPasswordField && widthOfEmailField==widthOfPasswordField)
				{
					System.out.println("Scenario is verified and height and width of firstname and surname is equal, height and width of email and password fields are equal");
				}
				else
					System.out.println("Scneario is not verified");
				
				
				
				Thread.sleep(3000);
				
				driver.manage().window().minimize();
				driver.quit();
				
				
		
	}

}
