package basicPrograms9;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class A5_Screenshot {
	
	public WebDriver driver;
	
  @Test
  public void alertscreen() throws Exception  {
	  
      driver.findElement(By.id("alertButton")).click();
      
	  Thread.sleep(3000);
	  
	  String str=driver.switchTo().alert().getText();
	  System.out.println(str);
	  
	  Thread.sleep(2000);
	  
	  driver.switchTo().alert().accept();
	  Thread.sleep(3000);
	  
	  String Images = "alert";
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(scrFile, new File("C:\\Users\\DELL\\Desktop\\HYD\\"+Images+".png"));
	  
	 
	  
  }
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  
	  String Images = "openurl";
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(scrFile, new File("C:\\Users\\DELL\\Desktop\\HYD\\"+Images+".png"));

	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
