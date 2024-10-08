import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Streams_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Select   options1 = new Select(driver.findElements(By.id("dropdown-class-example"));
		List<WebElement> sel = options1.stream().filter(o->o.getText().contains("Option1")).collect(Collectors.toList());
		System.out.println("selected ****"+options1);
		System.out.println("selected ****"+sel);
	}

}
