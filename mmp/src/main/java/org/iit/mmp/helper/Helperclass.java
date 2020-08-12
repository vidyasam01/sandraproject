package org.iit.mmp.helper;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helperclass {

	WebDriver driver;
	
	public Helperclass(WebDriver driver) {
			this.driver=driver;
		}
	
	public void launchurl(String url) {
		
		driver.get(url);
		
	}
	
	public WebDriver switchToAFrame(String frame, int timeinsecs) {
		
		WebDriverWait wait= new WebDriverWait(driver,timeinsecs);
		driver=wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		return driver;
			}

 public void navigateToAModule(String ModuleName) {
		
		driver.findElement(By.xpath("//span[contains(text(),'"+ ModuleName +"')]")).click();
			}
 
 public void navigateToadminModule(String ModuleName) {
		
		driver.findElement(By.xpath("//span[contains(text(),'"+ ModuleName +"')]")).click();
			}

 
 public void login(String uName,String pWord) {
		driver.findElement(By.id("username")).sendKeys(uName );
		driver.findElement(By.id("password")).sendKeys(pWord );
		driver.findElement(By.name("submit")).click();	
	}
	
	public void adminlogin(String uName,String pWord) {
		driver.findElement(By.id("username")).sendKeys(uName );
		driver.findElement(By.id("password")).sendKeys(pWord );
		driver.findElement(By.name("admin")).click();	
	}
	
	public void capturescreenshot(String tc_name) throws IOException {
		
		System.out.println("Capturing the Screenshot for testcase" + tc_name);	
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		File srcFile=scrshot.getScreenshotAs(OutputType.FILE);
	String  destpath=System.getProperty("user.dir")+"\\screenshots\\"+tc_name+Calendar.getInstance().getTimeInMillis()+"jpg";
	File destFile= new File(destpath);
	FileUtils.copyFile(srcFile, destFile);
	System.out.println("Exiting the Screenshot method");
		
	}
}
