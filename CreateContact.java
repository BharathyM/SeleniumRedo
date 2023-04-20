package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
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
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		
		driver.findElement(By.xpath("//*[@id='firstNameField']")).sendKeys("Bharathy");
		driver.findElement(By.xpath("//*[@id='lastNameField']")).sendKeys("Perumal");
		
		driver.findElement(By.xpath("//*[@id='createContactForm_firstNameLocal']")).sendKeys("Bha");
		driver.findElement(By.xpath("//*[@id='createContactForm_lastNameLocal']")).sendKeys("Per");
		
		driver.findElement(By.xpath("//*[@id='createContactForm_departmentName']")).sendKeys("IT");
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("This is a dummy contact");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("bharathyps.88@gmail.com");
		
		WebElement wb = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select ss= new Select(wb);
		
		ss.selectByVisibleText("Texas");
		
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("This is an important Note!!!!");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println(driver.getTitle());
		
		
		driver.close();
		
		
		
		

	}

}
