package highLevelPrograms;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B20_ScrollBar_Element {
	
	public WebDriver driver;
	
  @Test
  public void Scrollflow() {
	  
	JavascriptExecutor js =(JavascriptExecutor)driver;
	WebElement Element = driver.findElement(By.linkText("Linux"));
	js.executeScript("arguments[0].scrollIntoView();", Element);
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/guru99home/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	  
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
