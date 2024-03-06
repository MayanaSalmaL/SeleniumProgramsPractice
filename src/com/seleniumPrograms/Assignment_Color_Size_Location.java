package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Assignment_Color_Size_Location {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement createNewAccountButton = driver
				.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));

		String colourOfButton = createNewAccountButton.getCssValue("color");

		String hexaValue = Color.fromString(colourOfButton).asHex();

		System.out.println(colourOfButton);
		System.out.println(hexaValue);

		String colourOfButtonBackground = createNewAccountButton.getCssValue("background-color");

		String hexaValueBackground = Color.fromString(colourOfButtonBackground).asHex();

		System.out.println(colourOfButtonBackground);
		System.out.println(hexaValueBackground);

	}

}
