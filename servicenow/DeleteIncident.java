package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteIncident extends ServiceNowProjectSpecificMethods
{
	@Test
	public  void tc04() throws InterruptedException
	{ 
		
		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
		
		WebElement element2 = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(element2);
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010052",Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		String incidentNumber = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		driver.findElement(By.xpath("//button[@id='sysverb_delete']")).click();
		driver.findElement(By.id("ok_button")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='incident_hide_search']//input")).sendKeys(incidentNumber,Keys.ENTER);		
		
		WebElement searchResult = driver.findElement(By.xpath("//table[@id='incident_table']//td[text()='No records to display']"));
		if(searchResult.isDisplayed()== true)
		{
			System.out.println("Incident is deleted");
		}
		else
		{
			System.out.println("Incident is not deleted");
		}
		
   }

}
