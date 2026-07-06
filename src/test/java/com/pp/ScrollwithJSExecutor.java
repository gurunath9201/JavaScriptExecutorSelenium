package com.pp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollwithJSExecutor {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/iframe");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement footertext=driver.findElement(By.linkText("Expand Testing"));
		//js.executeScript("arguments[0].scrollIntoView()", footertext);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		System.out.println(footertext.getText());
		js.executeScript("arguments[0].click", footertext);
	}
}
