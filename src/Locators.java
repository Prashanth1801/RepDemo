import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 * @throws JsonProcessingException 
	 */
	public static void main(String[] args) throws InterruptedException, JsonProcessingException, IOException {
		// TODO Auto-generated method stub

		//Chrome driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		//driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		
		driver.manage().window().maximize();;
		
		//driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		//Locator by id ,name and class
		//driver.findElement(By.id("email")).sendKeys("prashanth1801");
		//driver.findElement(By.name("password")).sendKeys("test124");
		//driver.findElement(By.className("btn-primary button p-v-2-xs p-h-5-xs m-v-3-xs col-12-xs")).click();
		
		
		// Locators by CSS selectors
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("prashanth1801@gmail.com");
		//driver.findElement(By.cssSelector("input.password form-input p-v-1-xs p-l-2-xs p-r-6-xs col-12-xs bodyMain")).sendKeys("test124");
		//driver.findElement(By.cssSelector("input#password")).sendKeys("demo123");
		//driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		//driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("prashanth1801");
		driver.findElement(By.id("inputUsername")).clear();
		
		driver.findElement(By.name("inputPassword")).sendKeys("test124");
		//driver.findElement(By.className("signInBtn")).click();
		
	
		
		driver.findElement(By.xpath("//*[starts-with(@name,'chkboxT')]")).click();
		driver.findElement(By.xpath("//*[contains(@name,'One')]")).click();
		
		driver.findElement(By.className("submit")).click();
		String t1= driver.findElement(By.cssSelector(".error")).getText();
		System.out.println("Captured text "+t1);
		
		
		//Thread.sleep(3000);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		//
		
		Thread.sleep(3000);
		
	
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		
		System.out.println("Final Step-- Forgot screen started");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("prashanth");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("prashanth1801@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("prahanth1801@hotmail.com");
		
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9949556092");
		driver.findElement(By.xpath("//input[@type='text'][3]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9949556093");
		
		
		System.out.println("Step2");
		System.out.println("Step3");
		
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
			
		//driver.close();				
		//driver.quit();
		
		File file = new File("E://Selenuim//Payload.json");
		
		ObjectMapper om = new ObjectMapper();
		
		JsonNode rootnode  = om.readTree(file);
	   JsonNode datasets = rootnode.get("brands");
		
		if (datasets.isArray()) {
		for (JsonNode dataset : datasets)
		{
			//String id =  dataset.get("id").asText();
			String brand =  dataset.get("brand").asText();
			System.out.println(" Brands : " +brand);
		}
		}
		
		/*
		String brand =  rootnode.get("brand").asText();
		System.out.println(" Brands : " +brand);
		
		*/
		
	}

}
