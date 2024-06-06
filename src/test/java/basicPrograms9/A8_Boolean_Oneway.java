package basicPrograms9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A8_Boolean_Oneway {
	
	public WebDriver driver;
	
  @Test
  public void roundtrip() throws Exception {
	  
	driver.findElement(By.xpath("//*[@id=\"approot\"]/div/app-home/div/app-home-container/div[1]/div/app-trip-search/div/div[1]/div/div/button[2]")).click();
	Thread.sleep(3000);
	
	Boolean printcondition = driver.findElement(By.xpath("//*[@id=\"approot\"]/div/app-home/div/app-home-container/div[1]/div/app-trip-search/div/div[1]/div/div/button[2]")).isDisplayed();
	System.out.println(printcondition);
	
	WebElement ele = driver.findElement(By.xpath("//*[@id=\"approot\"]/div/app-home/div/app-home-container/div[1]/div/app-trip-search/div/div[1]/div/div/button[2]"));
	
	if (ele.isDisplayed()) {
		
		System.out.println("Round trip is there passed");
		
	} else {
		
		System.out.println("No Not Available");

	}
	
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.savaari.com/");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  
	  }

  @AfterTest
  public void afterTest() {
  }

}
