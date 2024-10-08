import org.apache.hc.core5.util.Asserts;
import org.checkerframework.dataflow.qual.AssertMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumIntro  {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		//ChromeDriver driver = new ChromeDriver();
	    //System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Downloads\\chromedriver_win32 (1)");
		//WebDriver driver = new ChromeDriver(); 
		//WebDriverManager.chromedriver().driverVersion(" 109.0.5414.168").setup();
		
		//Chrome driver
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		//Firefox driver 
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\home\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		//Thread.sleep(4000);
		String url= driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	
		//Assert.isTrue(true, url, "google.com");
		//Assert.assertEquals("google.com", url);
	
		driver.close();				
		driver.quit();
	}

		
}
