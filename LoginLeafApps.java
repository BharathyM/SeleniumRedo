package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLeafApps {

	public static <WebElement> void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement user = driver.findElement(By.id("username"));
		user.send
		 	
		
		 	 	
		
		driver.close();
	}

}
