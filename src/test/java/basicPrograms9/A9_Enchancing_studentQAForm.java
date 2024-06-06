package basicPrograms9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A9_Enchancing_studentQAForm {
	
	public WebDriver driver;
	
  @Test
  public void studentregister() throws InterruptedException {
	  
	 driver.findElement(By.id("firstName")).sendKeys("Lucky");
	 driver.findElement(By.id("lastName")).sendKeys("Avanthika");
	 driver.findElement(By.id("userEmail")).sendKeys("lucky@123");
	 driver.findElement(By.className("custom-control-input")).click();
	  driver.findElement(By.id("userNumber")).sendKeys("6303533403");
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("January");
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("1999");
	  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[1]")).click();
	  Thread.sleep(3000);
	  //driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
	  //driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
