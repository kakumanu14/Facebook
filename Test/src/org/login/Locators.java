package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-12\\eclipse-workspace\\Lanuch\\Test\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https:\\www.facebook.com");
    WebElement txtUserName=driver.findElement(By.id("email"));
  
    
    txtUserName.sendKeys("Java");
    WebElement txtPassword=driver.findElement(By.id("pass"));
    txtPassword.sendKeys("Hello");
    driver.quit();
    
	
	
	
}

}
