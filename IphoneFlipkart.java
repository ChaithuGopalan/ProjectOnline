package org.screenshot;

import java.awt.AWTException;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class IphoneFlipkart {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub
	

				

System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaithanya Gopalan\\eclipse-workspace\\SeleniumBrowser\\Driver\\chromedriver_win32\\chromedriver.exe");

WebDriver driver= new ChromeDriver();

driver.get("  https://www.flipkart.com/  ");
driver.manage().window().maximize();


JavascriptExecutor js=(JavascriptExecutor)driver;

//To scroll down

WebElement txt=driver.findElement(By.xpath("//input[@name='q']"));

txt.sendKeys("iphone",Keys.ENTER);

WebElement end=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
end.click();
js.executeScript("arguments[0].scrollIntoView(true)", txt);

//Screenshot
	
	Thread.sleep(4000);
TakesScreenshot tk=(TakesScreenshot)driver;

File src= tk.getScreenshotAs(OutputType.FILE);

File dest =new File ("C:\\Users\\Chaithanya Gopalan\\Documents\\Screenshot Files\\GreenCoreJava.jpe");

FileUtils.copyFile(src, dest);



}
}
