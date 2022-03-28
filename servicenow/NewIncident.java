package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewIncident extends ServiceNowProjectSpecificMethods
{
	
	
	@Test
	public  void tc01() throws InterruptedException
	
	{	
		
		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();			
		
		WebElement element2 = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(element2);
		driver.findElement(By.xpath("//button[@value='sysverb_new']")).click();
		
		driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']")).sendKeys("admin",Keys.ENTER);		
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Sample case");
		
		
		String incidentNumber = driver.findElement(By.id("incident.number")).getAttribute("value");		
		System.out.println("Incident Number is " + incidentNumber);
		
		driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incidentNumber,Keys.ENTER);
		
		String incidentCreated = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		if(incidentNumber.equals(incidentCreated))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failure");
		}
	}
}
