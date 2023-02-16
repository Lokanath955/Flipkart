package Lokanath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFacebookAccount {
  public static void main(String[] args) throws InterruptedException {
    // Set the path to the chromedriver executable
    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

    // Launch a new instance of Chrome
    WebDriver driver = new ChromeDriver();

    // Maximize the browser window
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    // Open Facebook sign up page
    driver.get("https://www.facebook.com/r.php");

    // Enter the first name
    driver.findElement(By.name("firstname")).sendKeys("Vinod");
    Thread.sleep(4000);

    // Enter the last name
    driver.findElement(By.name("lastname")).sendKeys("Ratna");
    Thread.sleep(4000);

    // Enter the mobile number or email address
    driver.findElement(By.name("reg_email__")).sendKeys("nloknath9880@gmail.com");
    Thread.sleep(4000);
    // Enter the password
    driver.findElement(By.name("reg_passwd__")).sendKeys("asdfghjkl@123456");
    Thread.sleep(4000);
    // Select the birthdate
    driver.findElement(By.id("day")).sendKeys("01");
    Thread.sleep(4000);
    driver.findElement(By.id("month")).sendKeys("Jan");
    Thread.sleep(4000);
    driver.findElement(By.id("year")).sendKeys("2000");
    Thread.sleep(4000);
    // Select the gender
    driver.findElement(By.cssSelector("input[value='1']")).click();
    Thread.sleep(4000);

    // Click the Sign Up button
    driver.findElement(By.name("websubmit")).click();
    driver.close();

  }
}
