package testRunner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseClass;

public class Tc0001 extends BaseClass {

	@Test(priority = 0)
	private void Search_Hotel() {
		// search hotel
		Select s1 = new Select(driver.findElement(By.id("location")));
		s1.selectByIndex(7);
		Select s2 = new Select(driver.findElement(By.id("hotels")));
		s2.selectByVisibleText("Hotel Sunshine");
		Select s3 = new Select(driver.findElement(By.id("room_type")));
		s3.selectByValue("Super Deluxe");
		Select s4 = new Select(driver.findElement(By.id("room_nos")));
		s4.selectByIndex(4);
		Select s5 = new Select(driver.findElement(By.id("adult_room")));
		s5.selectByIndex(2);
		Select s6 = new Select(driver.findElement(By.id("child_room")));
		s6.selectByIndex(2);
		driver.findElement(By.id("Submit")).click();

	}

	@Test(priority = 1)
	private void Select_Hotel() {
		// Select Hotel
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();

	}

	@Test(priority = 2)
	private void bookAHotel() {
		driver.findElement(By.id("first_name")).sendKeys("Sunil");
		driver.findElement(By.name("last_name")).sendKeys("kumar");
		driver.findElement(By.xpath(".//textarea[@rows='4']")).sendKeys("abcd");
		driver.findElement(By.xpath(".//input[@id='cc_num']")).sendKeys("1234567891234567");
		Select s3 = new Select(driver.findElement(By.id("cc_type")));
		s3.selectByIndex(4);
		Select s4 = new Select(driver.findElement(By.xpath(".//select[@id='cc_exp_month']")));
		s4.selectByVisibleText("December");
		Select s5 = new Select(driver.findElement(By.xpath(".//select[@id='cc_exp_year']")));
		s5.selectByVisibleText("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
	}

	@Test(priority = 3)
	private void printOrderNo() throws InterruptedException {
		Thread.sleep(7000);
		String orderNo = driver.findElement(By.id("order_no")).getAttribute("value");
		System.out.println("Order Number is : " + orderNo);
	}

}
