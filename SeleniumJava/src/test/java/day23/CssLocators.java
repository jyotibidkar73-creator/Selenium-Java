package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		// CSS by id(#)
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Phone");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Phone");//without tag

		//CSS by.className 
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Phone"); 
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Computers");//without tag name 
		
		
		//Css by attribute 
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Electrician");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Electrician");
		
		//Css by class&attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Smartphones");
	}

}
