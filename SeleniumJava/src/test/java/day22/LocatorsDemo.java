package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("enter-name")).sendKeys("Mac");
		
		//id
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		Boolean status =driver.findElement(By.id("autocomplete")).isDisplayed();
		System.out.println(status);
		
	     //linkText 
		//driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		
		//PartialLinktext
		//driver.findElement(By.partialLinkText("Free Access")).click();
		
		//Classname
		List<WebElement>  header =driver.findElements(By.className("gf-li"));
		System.out.println("total number of links"+header.size());
		
		//Tag name
		
		List<WebElement>links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		

	}

}
