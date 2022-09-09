//package testRunner;
//
//import java.sql.Timestamp;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class SampleTest {
//	public static WebDriver driver;
//
//	@BeforeSuite
//	public void beforesuite() {
//		Date date = new Date();
//		Timestamp ts = new Timestamp(date.getTime());
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(formatter.format(ts));
//
//	}
//
//	@BeforeTest
//	private void Startdriver() {
//		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//	}
//
//	@BeforeClass
//
//	private void NavigateToUrl() {
//
//		driver.navigate().to("https://www.google.com/");
//	}
//
//	@Test
//	private void tc1() {
//		driver.get("https://www.facebook.com/");
//
//		String actualTitle = "Facebook – log in or sign up";
//		String expectedTitle = driver.getTitle();
//		Assert.assertEquals("Facebook – log in or sign up", actualTitle, expectedTitle);
//
//	}
//
//	@Test
//	private void tc2() {
//		driver.get("https://www.facebook.com/");
//
//		String currentUrl = driver.getCurrentUrl();
//		String actualUrl = "https://www.facebook.com/";
//		Assert.assertEquals("https://www.facebook.com/", currentUrl, actualUrl);
//
//	}
//
//	@Test
//	private void tc3() {
//		driver.get("https://www.facebook.com/");
//		String s = driver.findElement(By.xpath("//img[@class = 'fb_logo _8ilh img']")).getText();
//
//		System.out.println(s);
//
//	}
//
//	@Test
//	private void tc4() {
//		// with valid credentials
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("sunilhiregowda@gmail.com");
//		driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("sunil@123");
//		driver.findElement(By.xpath("//button[@name = 'login']")).click();
//
//		String actualTitle = "Log in to Facebook";
//		String expectedTitle = driver.getTitle();
//		Assert.assertEquals("Log in to Facebook", actualTitle, expectedTitle);
//	}
//
//	@Test
//
//	private void tc5() {
//		// with invalid credentials
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("sfnnbvbjk@gmail.com");
//		driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("aadjkjghnbvajh");
//		driver.findElement(By.xpath("//button[@name = 'login']")).click();
//
//		String actualMessage = "Find your account and log in.";
//		String expectedMessage = driver.findElement(By.linkText("Find your account and log in."))
//				.getAttribute(actualMessage);
//		Assert.assertEquals("Find your account and log in.", actualMessage, expectedMessage);
//	}
//
//	@Test
//
//	private void tc6() {
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("sunilhiregowda@gmail.com");
//		driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("asdfghhjk@123");
//		driver.findElement(By.xpath("//button[@name = 'login']")).click();
//
//		String actualMessage = "The password that you've entered is incorrect. ";
//		String expectedMessage = driver.findElement(By.xpath("//div[@class = '_9ay7']")).getAttribute(actualMessage);
//		Assert.assertEquals("The password that you've entered is incorrect. ", actualMessage, expectedMessage);
//
//	}
//
//	@AfterTest
//	private void testafter() {
//		driver.close();
//
//	}
//
//	@AfterClass
//
//	private void classafter() {
//		System.out.println("afterClass method is executed ");
//
//	}
//
//	@AfterSuite
//	private void suiteafter() {
//		// TODO Auto-generated method stub
//		Date date = new Date();
//		Timestamp ts = new Timestamp(date.getTime());
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(formatter.format(ts));
//
//	}
//
//}
