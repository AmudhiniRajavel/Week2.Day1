package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:/leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Email Address:')]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("babu@testleaf.com");
		driver.findElement(By.linkText("Find Contacts")).click();
		driver.close();
		
	}
}
