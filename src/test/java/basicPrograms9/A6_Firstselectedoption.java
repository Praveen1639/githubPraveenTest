package basicPrograms9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A6_Firstselectedoption {
	public WebDriver driver;
	
  @Test(priority = 1)
     public void options() {
	   WebElement ele1 = new Select(driver.findElement(By.id("day"))).getFirstSelectedOption();
	   System.out.println(ele1.getText());
	
	    if (ele1.getText().equalsIgnoreCase("22")) {
		   System.out.println("pass");
		
	    } else {
	    	System.out.println("Fail");

	    }
		
	}
  
	
	@Test(priority = 2)
	  public void date() { 
		
		WebElement ele2 = new Select(driver.findElement(By.id("day"))).getFirstSelectedOption();
		System.out.println(ele2.getText());
		
		if (ele2.getText().equalsIgnoreCase("24")) {
			System.out.println("pass");
			
		} else {
			System.out.println("Fail");

		}
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/signup");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
