package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeads {

	public static void main(String[] args) throws InterruptedException {

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
		
		//Navigate to Leads
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		//Seacrh Email
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(100);
		
		
String name = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName '])[1]")).getText();
		
		System.out.println(name);
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		 	 	
		String Title = driver.getTitle();
	 if(Title.equalsIgnoreCase("Duplicate Lead"))
		 System.out.println("Title is correct");
	 
	 driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	 Thread.sleep(100);
	 
	 String expname="sunita";
	 
	 if(name.equals(expname))
		 System.out.println("Name matched");
	 
		 driver.close();
	}

}
