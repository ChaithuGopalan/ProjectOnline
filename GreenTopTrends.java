package org.screenshot;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTopTrends {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub
	

				

System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaithanya Gopalan\\eclipse-workspace\\SeleniumBrowser\\Driver\\chromedriver_win32\\chromedriver.exe");

WebDriver driver= new ChromeDriver();

driver.get("  http://greenstech.in/selenium-course-content.html ");
driver.manage().window().maximize();


JavascriptExecutor js=(JavascriptExecutor)driver;

//To scroll down

WebElement txt=driver.findElement(By.xpath("//h3[@title='Top Selenium Trends In 2020']"));

js.executeScript("arguments[0].scrollIntoView(true)", txt);

//Screenshot
	
	Thread.sleep(4000);
TakesScreenshot tk=(TakesScreenshot)driver;

File src= tk.getScreenshotAs(OutputType.FILE);

File dest =new File ("C:\\Users\\Chaithanya Gopalan\\Documents\\Screenshot Files\\GreenTopTrends.jpe");

FileUtils.copyFile(src, dest);



}
}