package org.screenshot;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BabyFlipkart {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaithanya Gopalan\\eclipse-workspace\\SeleniumBrowser\\Driver\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();

	driver.get("  https://www.flipkart.com/  ");
	driver.manage().window().maximize();

	Actions a=new Actions(driver);


	WebElement end=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	end.click();


	WebElement txt=driver.findElement(By.xpath("//img[@alt='Beauty, Toys & More']"));

	a.moveToElement(txt).perform();

	WebElement womensWestern=driver.findElement(By.xpath("//a[contains(text(),'Baby Care')]"));
	womensWestern.click();

	Thread.sleep(5000);
	WebElement top=driver.findElement(By.xpath("//span[contains(text(),'Baby & Kids')]"));

	a.moveToElement(top).perform();


	//Screenshot


		Thread.sleep(4000);
	TakesScreenshot tk=(TakesScreenshot)driver;

	File src= tk.getScreenshotAs(OutputType.FILE);

	File dest =new File ("C:\\Users\\Chaithanya Gopalan\\Documents\\Screenshot Files\\Flipkartbaby.jpe");

	FileUtils.copyFile(src, dest);


}
}
