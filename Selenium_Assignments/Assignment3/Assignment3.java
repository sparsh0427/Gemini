package com.codebind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sparsh\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://thedemosite.co.uk/savedata.php";
		driver.get(baseUrl);
		String username = "sparsh";
		String password = "sparsh";
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath("//html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")).click();
		Thread.sleep(500);
		String text1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote")).getText().substring(14,14 + username.length());
		String text2 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote")).getText().substring(35,35 + password.length());
		if ((text1.equals(username)) && (text2.equals(password)))
	     System.out.println("Match found");
	    else 
	     System.out.println("Match Not found");
	}

}
