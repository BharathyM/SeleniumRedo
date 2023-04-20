package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLeads {

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
		
		//Enter First name & Search
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("BHarathy");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(100);
		
		//Select First result
		String original = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).getText();
		System.out.println(original);
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		
		System.out.println(driver.getTitle());
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TechnologyInternation");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		
		System.out.println(text);
		
		String cmp= "TechnologyInternation" +" " + '('+original+')';
		
		System.out.println(cmp);
		
		if(text.equalsIgnoreCase(cmp))
			System.out.println("Matches!!!!");
		
		driver.close();
		

	}

}
