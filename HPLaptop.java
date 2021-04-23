package org.screenshot;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HPLaptop {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub
	

				

System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaithanya Gopalan\\eclipse-workspace\\SeleniumBrowser\\Driver\\chromedriver_win32\\chromedriver.exe");

WebDriver driver= new ChromeDriver();

driver.get(" https://www.snapdeal.com/  ");
driver.manage().window().maximize();




//to search

WebElement txt=driver.findElement(By.xpath("//input[@ name='keyword']"));

txt.sendKeys(" hp laptop",Keys.ENTER);




//Screenshot
	
	Thread.sleep(4000);
TakesScreenshot tk=(TakesScreenshot)driver;

File src= tk.getScreenshotAs(OutputType.FILE);

File dest =new File ("C:\\Users\\Chaithanya Gopalan\\Documents\\Screenshot Files\\SnapdealHP.jpe");

FileUtils.copyFile(src, dest);


}
}
