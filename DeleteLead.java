package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Demosalesmanager");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");
		
		WebElement log = driver.findElement(By.className("decorativeSubmit"));
		log.click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Search Lead 
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9789");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(100);
		
		String wb = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).getText();
		
		System.out.println(wb);
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		
		//Delete Lead
		
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		
		
		//Search with captured ID
		
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("9789");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(100);
		
		//compare
		
		String res = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(res);
		
		
		driver.close();
		

	}

}
