package com.pp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import net.bytebuddy.asm.Advice.Return;

public class LoginTestWithJsExecutor {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/liveproject/index.html");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		js.executeScript("arguments[0].value='kiran@gmail.com'", username);
		js.executeScript("arguments[0].value='123456'", password);
		js.executeScript("arguments[0].click()", signin);
		String title=js.executeScript("return document.title").toString();
		
		if (title.equalsIgnoreCase("JavaByKiran | Dashboard")) {
			System.out.println("Valid Login Testcase is Passed");
		}
		
		js.executeScript("history.go(0)");
		js.executeScript("alert('Welcome')");
		
//		String url=js.executeScript("return document.url").toString();
//		if(url.equalsIgnoreCase("https://javabykiran.com/liveproject/index.html"))
//		{
//			System.out.println("Valid Login Testcase is Passed");
//		}
	}
}