package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Test Case
		 1)Launch browser
		 2)Open the URL "https://testautomationpractice.blogspot.com"
		 3)Validate title should be "Automation Testing Practice"
		 4)close browser
		 */
		
		// 1)Launch browser
		WebDriver driver = new ChromeDriver();
		
		
		// 2)Open the URL "https://testautomationpractice.blogspot.com"
		driver.get("https://testautomationpractice.blogspot.com");
		
		//3)Validate title should be "Automation Testing Practice"
		
		String title = driver.getTitle();
		if(title.equals("Automation Testing Practice"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		}
		
	//4)Close browser
			//driver.close();
			//driver.quite();


	}


