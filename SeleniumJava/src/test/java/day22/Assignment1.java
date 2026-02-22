package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
	//Total Number of links
		List <WebElement>links =driver.findElements(By.className("nav-link"));
		System.out.println("Toal Number of links:"+links.size());
		for(WebElement link : links) {
		    System.out.println(link.getText());
		}
		
		//Total Number of images
		List <WebElement>images =driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		for(WebElement img : images) {
		    System.out.println(img.getAttribute("alt"));
		}
		
		//Click on any prouct link using linktext/partial linktext
		driver.findElement(By.linkText("Phones"));
	}

}
