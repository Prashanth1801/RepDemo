import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

		// driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		Actions act = new Actions(driver);
		// act.moveToElement(driver.findElement(By.className("_1TOQfO"))).build().perform();
		System.out.println("Done");
		// driver.findElement(By.className("Pke_EE"));

		// WebElement txt= driver.findElement(By.className("Pke_EE"));
		Thread.sleep(10000);
		// WebElement txt= driver.findElement(By.xpath("//input[@Name='q')"));
		// //flipcart
		WebElement txt = driver.findElement(By.id("inputUsername"));
		WebElement pwd = driver.findElement(By.name("inputPassword"));
		act.moveToElement(txt).keyDown(Keys.SHIFT).sendKeys("dell laptop").build().perform();
		act.moveToElement(pwd).contextClick().build().perform();
		// act.moveToElement(txt).click().sendKeys("amazon");

		Thread.sleep(5000);

		System.out.println("Done-text entered");
		driver.close();

	}

}
