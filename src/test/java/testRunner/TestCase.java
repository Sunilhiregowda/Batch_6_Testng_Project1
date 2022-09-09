//package testRunner;
//
//import java.sql.Timestamp;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class TestCase {
//	public static WebDriver driver = null;
//
//	@BeforeSuite
//	private void beforesuite() {
//		Date date = new Date();
//		Timestamp ts = new Timestamp(date.getTime());
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(formatter.format(ts));
//	}
//
//	@BeforeTest
//	private void beforetest() {
//		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
////		System.out.println("2");
//	}
//
//	@BeforeClass
//	private void beforeclass() {
//		driver.get("https://www.facebook.com/");
//	}
//
//	@BeforeMethod
//	private void beforemethod() throws InterruptedException {
//
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(5000);
//	}
//
//	@Test(priority = 0)
//	private void tc1() {
//		String url = driver.getCurrentUrl();
//		Assert.assertEquals("https://www.facebook.com/", url);
//
//	}
//
//	@Test(priority = 1)
//	private void tc2() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Facebook – log in or sign up", title);
//
//	}
//
//	@Test(priority = 2)
//	private void tc3() {
//		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("1234");
//		System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
//		driver.findElement(By.name("login")).click();
//
//	}
//
//	@Test(priority = 3)
//	private void createAnAccount() {
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.linkText("Create New Account")).click();
//		driver.findElement(By.name("firstname")).sendKeys("Chand");
//		driver.findElement(By.name("lastname")).sendKeys("naga");
//		System.out.println(driver.findElement(By.name("firstname")).getAttribute("value"));
//		System.out.println(driver.findElement(By.name("lastname")).getAttribute("value"));
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("1234567894");
//		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("1234567894");
//		WebElement wel1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		Select drdw1 = new Select(wel1);
//		drdw1.selectByValue("17");
//		Select drdw2 = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
//		drdw2.selectByValue("8");
//		Select drdw3 = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
//		drdw3.selectByValue("2002");
//		driver.findElement(By.xpath("//label[text()='Male']")).click();
//
//	}
//
//	@Test
//	private void getText() {
//		String text = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(text);
//
//	}
//
//	@AfterMethod
//	private void aftermethod() {
//		driver.navigate().to("https://www.facebook.com/");
//	}
//
//	@AfterSuite
//	private void aftersuite() {
//		driver.close();
//	}
//}
