package week1.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorAndDropdown {

	public static void main(String[] args) {
		

		/**
		 * Locator:-
		 * 				id
		 * 				name
		 * 				className
		 * 				linkText
		 * 				partialLinkText
		 * 				tagName
		 * 				xpath
		 * 				cssSelector
		 * 
		 * Create Object:
		 * 			ClassName obj = new ClassName();
		 * 
		 * 
		 * For DropDown:
		 * 			- selectByVisibleText
		 * 			- selectByValue
		 * 			- selectByIndex
		 * 
		 * 
		 */
		
		// Step01: Launch the Browser - Driver Mapping
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Step02: Load the URL
		driver.get("http://iarchtaps.com:8080/opentaps/");
		//driver.navigate().to("http://iarchtaps.com:8080/opentaps/");
		//driver.navigate().forward();
		//driver.navigate().back();
		
		//Step03: maximize the browser window
		driver.manage().window().maximize();
		
		// Step04: Enter the UserName
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		// Step05: Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Step06: Click the Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.className("decorativeSubmit")).submit();
		
		// Step07: Click the CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Step08: Click the Leads
		driver.findElement(By.linkText("Leads")).click();
		
		// Step09: Click the Create Leads
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Step10: Choose the Value from source DD
		
		WebElement drsource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select select = new Select(drsource);
		select.selectByIndex(2);
		//select.selectByValue("LEAD_PARTNER");
		//select.selectByVisibleText("Direct Mail");

	}

}
