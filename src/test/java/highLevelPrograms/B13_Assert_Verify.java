package highLevelPrograms;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class B13_Assert_Verify {
	
	public WebDriver driver;
	
  @Test
  public void funorder() {
	  
	  String Actualvalue = "$3";
	  String Expectedvalue = driver.findElement(By.xpath("//b[normalize-space()='$398']")).getText();
	  System.out.println(Expectedvalue);
	  
		
		  try {
			  
	      System.out.println("Assertion starts here...");
		  
		  Assert.assertEquals(Actualvalue, Expectedvalue);
		  
			  
			
		} finally {
			
			  System.out.println("Apple");
			  
			  System.out.println("A blog for Software Testers");
			  
		}
		  
	  
	  
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
