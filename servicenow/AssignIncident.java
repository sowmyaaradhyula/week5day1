package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AssignIncident extends ServiceNowProjectSpecificMethods
{
	
	@Test
	public  void tc03() throws InterruptedException
	{
		driver.findElement(By.xpath("(//div[text()='Open'])[1]")).click();
		WebElement element2 = driver.findElement(By.id("gsft_main"));
		driver.switchTo().frame(element2);
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010057",Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		
		driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']")).sendKeys("Software",Keys.ENTER);		
		driver.findElement(By.xpath("//button[@id='lookup.incident.assignment_group']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles);
		String oldWindow = handles.get(0);
		String newWindow = handles.get(1);
		
		driver.switchTo().window(newWindow);
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Software",Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='glide_ref_item_link']")).click();
		
		driver.switchTo().window(oldWindow);
		
		
		driver.switchTo().frame(element2);
		driver.findElement(By.xpath("//textarea[@id='activity-stream-textarea']")).sendKeys("modified");
		driver.findElement(By.id("sysverb_update")).click();
		System.out.println("Incident is updated");
		
		
	}
}
