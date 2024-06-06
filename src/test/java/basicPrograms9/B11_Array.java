package basicPrograms9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class B11_Array {
	
	public WebDriver driver;
	
  @Test
  public void functionality() throws Exception {
	  
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  Thread.sleep(3000);
	  
	  String str = driver.findElement(By.xpath("(//ul[@role='listbox'])[1]")).getText();
	  Thread.sleep(3000);
	  
	  System.out.println(str);
	  
	  System.out.println(str.length());
	  
	  String a[] = str.split("/n");
	  
	  System.out.println(a.length);
	  
	  for (int i = 0; i < a.length; i++) {
		  
		  if (a[i].equalsIgnoreCase("selenium webdriver")) {
			  
			  driver.findElement(By.name("q")).clear();
			  Thread.sleep(3000);
			  
			  driver.findElement(By.name("q")).sendKeys(a[i]);
			  Thread.sleep(3000);
			
		}
		
		  driver.findElement(By.name("q")).clear();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.name("q")).sendKeys(a[i]);
		  Thread.sleep(3000);
		
	}
	  
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	   
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
