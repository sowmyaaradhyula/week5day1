package week5.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLeadTestng extends ProjectSpecificMethods 
{
			
			@Test
			public void	runtc001()
			{
				
				
				//Create Lead
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("xxx");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rrr");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("uuu");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("aaa");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("bbb");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("ccc");
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcdefghi@gmail.com");
				WebElement elementStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select 	dd = new Select(elementStateProvince);
				dd.selectByVisibleText("New York");
				driver.findElement(By.className("smallSubmit")).click();		
				System.out.println(driver.getTitle());
			
			
			}
		

}


