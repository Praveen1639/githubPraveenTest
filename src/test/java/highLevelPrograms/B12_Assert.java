package highLevelPrograms;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class B12_Assert {
	
	public WebDriver driver;
	
  @Test
  public void funOperation() {
	  
	 String Actualtitle = "Mercury Tours";
	 String Expectedtitle = driver.getTitle();
	 System.out.println(Expectedtitle);
	 
	 System.out.println("Welcome to Selenium");
	 
	 Assert.assertEquals(Actualtitle, Expectedtitle);
	 
	 System.out.println("Assertion starts here...");
	 
	 System.out.println("A blog for Software Testers");
	 
	 driver.quit();
	  
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
