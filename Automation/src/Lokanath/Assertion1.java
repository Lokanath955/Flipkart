package Lokanath;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assertion1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String Title = driver.getTitle();
assertEquals(Title, Title)
		( Title.equals( Title)) {
			
			System.out.println("if title is matching");
		}
		
		else {
			System.out.println("if title is not matching");
		}
	}
	
	}


