package basicPrograms9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A7_INR_optionsvalidation {
	public WebDriver driver;
	
  @Test
  public void options() {
	  
	  List<WebElement> allvalues = new Select(driver.findElement(By.id("day"))).getOptions();
	  System.out.println(allvalues.get(9).getText());
	  
	  for (int i = 0; i < allvalues.size(); i++) {
		System.out.println(allvalues.get(i).getText());
		
		if (allvalues.get(i).getText().equalsIgnoreCase("16")) {
			
			System.out.println("its matched passed");
			
		} else {
			
			System.out.println("Not matched");

		}
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
