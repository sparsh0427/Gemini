package com.codebind;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sparsh\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://facebook.com";
		driver.get(baseUrl);
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[2]/div/ul/li[11]/a")).click();
		driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		String dob = "19-Mar-2020";
		String[] a = new String[3];
		a = dob.split("-");
		Thread.sleep(2000);
		Select day = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		Select month = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		Select year = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		day.selectByVisibleText(a[0]);
		month.selectByVisibleText(a[1]);
		year.selectByVisibleText(a[2]);
	
		List<WebElement> values = year.getOptions();
		ArrayList<Integer> checking = new ArrayList<Integer>();
		for(int i = 1 ; i < values.size() ; i++) {
//			System.out.println(values.get(i).getText().getClass().getName());
//			break;
//			System.out.println(values.get(i).getText());
			checking.add(Integer.parseInt(values.get(i).getText()));
		}
		if(checking.get(0) > checking.get(1)) {
			Boolean flag = true;
			for(int i = 0 ; i < checking.size() - 1 ; i++) {
				if(checking.get(i) < checking.get(i+1)) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println("Year Dropdown is in Descending Order");
			}
		}else if(checking.get(0) < checking.get(1)) {
			Boolean flag = true;
			for(int i = 0 ; i < checking.size() - 1 ; i++) {
				if(checking.get(i) > checking.get(i+1)) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println("Year Dropdown is in Ascending Order");
			}
		}else {
			System.out.println("Year Dropdown is neither in Ascending or Descending Order");
		}
	
		
	}
}
