package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbauto {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),\"Create new account\")]")).click();
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Bharathy");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Perumal");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9789569286");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Password-123");
		
		WebElement dd= driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select select = new Select(dd);
		
		select.selectByValue("11");
		
		WebElement dd1= driver.findElement(By.xpath("//select[@id='month']"));
		Select select1 = new Select(dd1);
		
		select1.selectByVisibleText("Dec");
		
		WebElement dd2= driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select select2 = new Select(dd2);
		
		select2.selectByValue("1988");
		
		WebElement gender = driver.findElement(By.xpath("//input[@name='sex']"));
		gender.click();
				
		
	}

}  
