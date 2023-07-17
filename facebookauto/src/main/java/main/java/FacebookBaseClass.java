package main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookBaseClass {

	public void login(WebDriver driver) throws InterruptedException {

		maximizeBrowser(driver);
		Thread.sleep(2000);
		url(driver);
		Thread.sleep(2000);
		username(driver);
		Thread.sleep(2000);
		password(driver);
		Thread.sleep(2000);
		loginButton(driver);
		Thread.sleep(2000);
		account(driver);
		Thread.sleep(2000);
		logoutbutton(driver);
	}
                                                                
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void url(WebDriver driver) {
		driver.get("https://www.facebook.com/");
	}

	public void username(WebDriver driver) {
		driver.findElement(By.name("email")).sendKeys("mathurriya883@gmail.com");
	}

	public void password(WebDriver driver) {
		driver.findElement(By.name("pass")).sendKeys("riyamathur1234");
	}

	public void loginButton(WebDriver driver) {
		driver.findElement(By.name("login")).click();

	}

	public void account(WebDriver driver) {
		driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/span[1]/div[1]/div[1]")).click();
	}
	

	public void logoutbutton(WebDriver driver) {
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]"))
				.click();
	}

	public void closebrouser(WebDriver driver) {
		driver.close();

	}

}
