package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		driver.findElement(By.id("input-email")).sendKeys("KathirVelu@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Kathir@");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("monitor");
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//select[@name='category_id']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Monitors')]")).click();
		driver.findElement(By.xpath("//input[@name='sub_category']")).click();
		driver.findElement(By.xpath("//input[@id='button-search']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Phones & PDAs')]")).click();
		
		driver.findElement(By.xpath("//select[@id='input-sort']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Price (High > Low)')]")).click();
		driver.findElement(By.xpath("//input[@data-original-title='Compare this Product']"));
		//driver.findElement(By.xpath("//a[contains(text(),'Components')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]")).click();
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
	}

}
