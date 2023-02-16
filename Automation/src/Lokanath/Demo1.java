package Lokanath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
  public static void main(String[] args) {
    // Set the path to the chromedriver executable
    System.setProperty("webdriver.chrome.driver", "/Automation/driver/chromedriver.exe");

    // Launch a new instance of Chrome
    WebDriver driver = new ChromeDriver();

    // Maximize the browser window
    driver.manage().window().maximize();

    // Open a website
    driver.get("https://www.google.com");

    // Close the browser
    driver.quit();
  }
}
