package main.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	public static void main(String[] args) throws InterruptedException, IOException {
		Properties p = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\ashi_\\Desktop\\automation\\automation\\eclipse_selenium\\AdvanceAutomation\\src\\main\\java\\openMRS\\Property.properties");
		p.load(file);
		System.setProperty(p.getProperty("BrowserName"), p.getProperty("BrowserPath"));
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Select s;

		// URL
		driver.get(p.getProperty("FURL"));
		Thread.sleep(2000);

		// click on Create New Account
		// driver.findElement(By.xpath("CreateNewAccount1")).click();
		driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//input[@name = 'firstname']")));
		
		// Registration information
		driver.findElement(By.name("firstname")).sendKeys("riya");
		
		driver.findElement(By.name(p.getProperty("Surname"))).sendKeys("mathur");
		Thread.sleep(2000);
		driver.findElement(By.name(p.getProperty("MobileNumberOrEmailAddress"))).sendKeys("mathurriya883@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name(p.getProperty("MobileNumberOrEmailAddress1"))).sendKeys("mathurriya883@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name(p.getProperty("Newpassword"))).sendKeys("riyamathur1234");
		Thread.sleep(2000);
		s = new Select(driver.findElement(By.xpath(p.getProperty("Day"))));
		s.selectByValue("2");
		Thread.sleep(2000);
		s = new Select(driver.findElement(By.xpath(p.getProperty("Month"))));
		s.selectByValue("5");
		Thread.sleep(2000);
		s = new Select(driver.findElement(By.xpath(p.getProperty("Year"))));
		s.selectByValue("1980");
		Thread.sleep(2000);
		driver.findElement(By.name(p.getProperty("Female"))).click();
		driver.findElement(By.name(p.getProperty("Signup"))).click();
		//screen short
		
        
	}

}
