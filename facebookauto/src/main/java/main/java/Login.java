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

public class Login {

	public static void main(String[] args) throws IOException, InterruptedException {

		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\ashi_\\Desktop\\automation\\automation\\eclipse_selenium\\facebookauto\\src\\main\\java\\main\\java\\Property.properties");
		p.load(file);
		System.setProperty(p.getProperty("BrowserName"), p.getProperty("BrowserPath"));
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Select s;

		// URL
		driver.get(p.getProperty("FURL"));
		Thread.sleep(2000);

		// Emailaddress and password
		driver.findElement(By.name(p.getProperty("EmailAddressOrPhoneNumber"))).sendKeys(p.getProperty("Email"));
		Thread.sleep(2000);
		driver.findElement(By.name(p.getProperty("Password"))).sendKeys(p.getProperty("Password1"));
		Thread.sleep(2000);
		// Login
		driver.findElement(By.name(p.getProperty("Login"))).click();
		
		Thread.sleep(2000);
	      
		//logout
		driver.findElement(By.xpath(p.getProperty("Account1"))).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
	
		
		


	}

}
