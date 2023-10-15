package Utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import fileReader.ConfigFileReader;


public class Helper {
 private static Helper Helper;    
    private static WebDriver driver ;
    public final static int TIMEOUT = 2;
	ConfigFileReader configFileReader;
     
    private Helper() {
    	String projectPath = System.getProperty("user.dir");
		System.setProperty("WebDriver.chrome.driver", projectPath + "src\\test\\resources\\drivers\\chromedriver.exe");        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
     }
    public static void openPage(String url) {
        driver.get(url);
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void NavBack() {
     driver.navigate().back();
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static void setUpDriver() {
        if (Helper==null) {
            Helper = new Helper();
        }
    }
     public static void tearDown() {
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
         Helper = null;
     }
     
     public static boolean waitForElementToBeInteractable(WebElement element) {
    	 try {
    	 WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).
					until(ExpectedConditions.elementToBeClickable(element));
    	 try {
				ele.click();
				
				return true;
				}
				catch(Exception e) {
					//JavascriptExecutor(driver) = 
				}     
    	 }
  		catch(Exception e) {
  			e.printStackTrace();
  			
  		}
  		return false;
     }
    
     public static boolean webClick(WebElement element) {
 		
 		try {
 						
 			WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).
 					until(ExpectedConditions.visibilityOf(element));
 			
 			if(ele.isDisplayed()) {
 				if(ele.isEnabled()) {
 				
 				try {
 					
 				ele.click();
 				
 				return true;
 				}
 				catch(Exception e) {
 					//JavascriptExecutor(driver) = 
 				}
 					
 				}
 				else {
 					throw new Exception("Element is not enabled");
 				}
 			}
 			else {
 				throw new Exception("Element is not displayed");
 			}
 			
 		}
 		catch(Exception e) {
 			e.printStackTrace();
 			
 		}
 		return false;
 		
 	}
     
}