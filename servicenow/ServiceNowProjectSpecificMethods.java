package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowProjectSpecificMethods 
{
	public ChromeDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		// Launch URL
		driver.get("https://dev115655.service-now.com/navpage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement element = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(element);
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		
		driver.findElement(By.id("user_password")).sendKeys("Sweety@2204");
		
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("Incident");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}

				
	
}