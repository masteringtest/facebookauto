package main.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSmokeTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver..driver",
				"C:\\Users\\ashi_\\Documents\\automation\\Browser_extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		// create facebook class
		FacebookBaseClass f = new FacebookBaseClass();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// calling methods
		f.maximizeBrowser(driver);
		Thread.sleep(2000);
		f.url(driver);
		Thread.sleep(2000);
		f.username(driver);
		Thread.sleep(2000);
		f.password(driver);
		Thread.sleep(2000);
		f.loginButton(driver);
		Thread.sleep(2000);

		// mouseover
		// step 1 create object of actions class
		Actions a = new Actions(driver);

		
		List<WebElement> ls = driver.findElements(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div[1]/ul"));
        int size=ls.size();
		//int size = ls.size();
		System.out.println("No of webelements" + size);

		// step4 for loop
		for (int i = 1; i <= size; i++) {
			// Wait
			Thread.sleep(2000);

			// Display Web Element Name
			System.out.println(driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div[1]/ul["
							+ i + "]"))
					.getText());

			// Perform Mouse Hover
			a.moveToElement(driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div[1]/ul["
							+ i + "]")))
					.click().perform();

		}
		
		Thread.sleep(3000);
		f.account(driver);
		Thread.sleep(2000);
		f.logoutbutton(driver);
	}
}
