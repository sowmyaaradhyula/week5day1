package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdateExistingIncident extends ServiceNowProjectSpecificMethods
{
		@Test
		public  void tc02()
		{
			
			driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
			
			WebElement element2 = driver.findElement(By.id("gsft_main"));
			driver.switchTo().frame(element2);
			
			driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010046",Keys.ENTER);
			driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
			
			WebElement urgency = driver.findElement(By.id("incident.urgency"));
			Select dd = new Select(urgency);
			dd.selectByIndex(0);
			
			WebElement state = driver.findElement(By.id("incident.state"));
			Select dd1 = new Select(state);
			dd1.selectByIndex(1);
			
			driver.findElement(By.id("sysverb_update")).click();
			
			driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
			
			//String updatedUrgency = driver.findElement(By.id("incident.urgency")).getText();
			//System.out.println(updatedUrgency);
			
			System.out.println("Incident is updated - UpdateExistingIncident");
					
	}
}
