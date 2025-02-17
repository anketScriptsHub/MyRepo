package pack1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyClass {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		try {
		    driver.get("ddsfg");
		} catch (Exception e) {
		    System.out.println("Error in accessing URL: " + e.getMessage());
		    throw new RuntimeException("Test failed due to invalid URL");
		}
	}
	}


