package Lokanath;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("ipad",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[contains(@alt,'APPLE iPad ')])[1]")).click();
		String parent = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parent);
		for(String window: allWindowId)
		driver.switchTo().window(window);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7330817465",Keys.ENTER);
	}

}
