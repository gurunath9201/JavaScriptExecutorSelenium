package com.pp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HighlightTestedElementswithJSExecutor {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/liveproject/index.html");
		
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		js.executeScript("arguments[0].style.border='2px solid red'", signin);
		
		js.executeScript("arguments[0].style.border='3px solid yellow'", driver.findElement(By.xpath("/html/body/div/div[2]")));
	}
}
