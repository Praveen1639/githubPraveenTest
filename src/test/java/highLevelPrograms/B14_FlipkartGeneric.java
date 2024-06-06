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

public class B14_FlipkartGeneric {
	
	public WebDriver driver;
	
	public Actions action;
	
	public void generic(String str) throws Exception {
		
		action = new Actions(driver);
		WebElement ele1 =  driver.findElement(By.xpath(str));
		action.moveToElement(ele1).build().perform();
		Thread.sleep(3000);
		
	}
	
  @Test
  public void clickable() throws Exception {
	  
	  for (int i = 1; i <= 7; i++) {
		  
		  generic("//*[@id=\"container\"]/div/div[2]/div/div/span["+i+"]");
		
	}
	  
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_5af2e10c-a16f-4b34-bd92-cb1245bae758_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=ZRQ4DKH28K8J");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
