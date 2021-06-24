package com.codebind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sparsh\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "C:\\Users\\Sparsh\\Downloads\\assignment.html";
		driver.get(baseUrl);
		String strUrl = driver.getCurrentUrl();
		System.out.println("Current Browser URL : "+strUrl);
		driver.findElement(By.xpath("//input[@name='user_id']")).sendKeys("sparsh0427");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd");
		WebElement uploadElement = driver.findElement(By.xpath("//input[@name='fileupload']"));
        uploadElement.sendKeys("C:\\Users\\Sparsh\\Downloads\\index.html");
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		Thread.sleep(1500);
		strUrl = driver.getCurrentUrl();
		System.out.println("Updated Browser URL : "+strUrl);
	}

}
