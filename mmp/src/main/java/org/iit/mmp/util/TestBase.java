package org.iit.mmp.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	WebDriver driver;
	@BeforeTest
	public void instantiateDriver() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
        
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

	
}
