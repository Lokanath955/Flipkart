package Lokanath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateFacebookAccountTest {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() {
    // Set the path to the chromedriver executable
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

    // Launch a new instance of Chrome
    driver = new ChromeDriver();

    // Maximize the browser window
    driver.manage().window().maximize();

    // Open Facebook sign up page
    driver.get("https://www.facebook.com/r.php");
  }

  @Test
  public void testCreateFacebookAccount() {
    // Enter the first name
    driver.findElement(By.name("firstname")).sendKeys("John");

    // Enter the last name
    driver.findElement(By.name("lastname")).sendKeys("Doe");

    // Enter the mobile number or email address
    driver.findElement(By.name("reg_email__")).sendKeys("user@example.com");

    // Enter the password
    driver.findElement(By.name("reg_passwd__")).sendKeys("password");

    // Select the birthdate
    driver.findElement(By.id("day")).sendKeys("01");
    driver.findElement(By.id("month")).sendKeys("Jan");
    driver.findElement(By.id("year")).sendKeys("2000");

    // Select the gender
    driver.findElement(By.cssSelector("input[value='1']")).click();

    // Click the Sign Up button
    driver.findElement(By.name("websubmit")).click();
  }

  @AfterMethod
  public void tearDown() {
    // Close the browser
    driver.quit();
  }
}
