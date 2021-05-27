package week1.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		//driver.switchTo().frame(nameOrId);
		//driver.switchTo().frame(0);
		
		WebElement frame= driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//li[text()='Item 5']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Themes")).click();

	}

}
