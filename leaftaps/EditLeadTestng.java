package week5.day1;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLeadTestng  extends ProjectSpecificMethods 
{
		
			@Test
			public void tc004() throws InterruptedException
			{
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
			driver.findElement(By.name("submitButton")).click();
			
	}
}


