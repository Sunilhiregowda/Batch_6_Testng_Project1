package Base;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	@BeforeSuite
	public void suiteBefore() {
		// timestamp
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		System.out.println(formatter.format(ts));

	}

	

	@BeforeTest
	public void testBefore() {
		// script for chrome browser and step
		// max screen
//		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().fullscreen();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.edgedriver().setup();
//		WebDriverManager.chromiumdriver().setup();
//		driver.get("https://www.google.com/");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	

	@BeforeClass
	public void classBefore() {
		// Login application , username and password , login button
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Sunilkumar26");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("La@7fnNaUPYai5");
		driver.findElement(By.id("login")).click();

		String actualTitle = "Adactin.com - Search Hotel";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals("Adactin.com - Search Hotel", actualTitle, expectedTitle);

	}

	
	@AfterTest
	public void testAfter() {
		driver.close();
		// driver.quit();

	}
	
	@AfterSuite
	public void suiteAfter() {
		// timestamp
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		System.out.println(formatter.format(ts));
	}

}
