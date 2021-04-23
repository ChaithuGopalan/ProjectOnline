package org.screenshot;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumTraining {

	public static void main(String[] args) throws AWTException, InterruptedException{
		// TODO Auto-generated method stub
	

				

System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaithanya Gopalan\\eclipse-workspace\\SeleniumBrowser\\Driver\\chromedriver_win32\\chromedriver.exe");

WebDriver driver= new ChromeDriver();

driver.get("  http://toolsqa.com/ ");
driver.manage().window().maximize();


JavascriptExecutor js=(JavascriptExecutor)driver;

//To scroll down

WebElement txt =driver.findElement(By.xpath("//span[contains(text(),'Selenium Training Benefit')]"));

js.executeScript("arguments[0].scrollIntoView(true)", txt);
String text= txt.getText();
System.out.println(text);


}
}