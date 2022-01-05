package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

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
		driver.findElement(By.linkText("Create Contact")).click();
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("Amudhini");
		String firstName1 = firstName.getAttribute("value");

		driver.findElement(By.id("lastNameField")).sendKeys("Rajavel");

		System.out.println(firstName1);

		driver.close();

	}

}
