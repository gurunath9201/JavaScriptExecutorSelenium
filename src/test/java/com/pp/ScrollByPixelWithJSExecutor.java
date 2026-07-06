package com.pp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollByPixelWithJSExecutor {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/iframe");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,950)");
		String text=driver.findElement(By.xpath("//*[@id=\"core\"]/div/div/div[2]/div/div/div[1]/div[2]")).getText();
		System.out.println(text);
	}
}
