package com.qa.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static void main(String[] args) {
    WebDriver driver;
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\gunaseelanp\\Downloads\\137.0.7151.68 chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
    Select select=new Select(driver.findElement(By.id("searchDropdownBox")));
    select.selectByVisibleText("Amazon Devices");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone");
    
    
}
}
