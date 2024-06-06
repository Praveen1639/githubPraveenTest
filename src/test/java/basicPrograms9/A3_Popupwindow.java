package basicPrograms9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A3_Popupwindow {
	public WebDriver driver;
	
  @Test
  public void windowpopup() throws Exception {
	  
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	
	String backtoParentwindow = driver.getWindowHandle();
	for(String childwindow : driver.getWindowHandles()) {
	driver.switchTo().window(childwindow);
	}
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[6]/a/span")).click();
	Thread.sleep(3000);
	
	driver.close();
	Thread.sleep(3000);
	
	driver.switchTo().window(backtoParentwindow);
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Home")).click();
	Thread.sleep(3000);
	
	
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
