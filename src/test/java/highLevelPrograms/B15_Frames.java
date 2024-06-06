package highLevelPrograms;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class B15_Frames {
	
	public WebDriver driver;
	
	public Actions action;
	
  @Test
  public void clickable() throws InterruptedException {
	  
	  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	  
	  WebElement DragFrom = driver.findElement(By.id("draggable"));
	  
	  WebElement DragTo = driver.findElement(By.id("droppable"));
	  
	  action = new Actions(driver);
	  
	  action.dragAndDrop(DragFrom, DragTo).build().perform();
	  
	  driver.switchTo().defaultContent();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.linkText("Demos")).click();
	  
  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
