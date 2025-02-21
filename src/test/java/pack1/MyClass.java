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
		
		    driver.get("https://www.facebook.com/login/");
	 		
		System.out.println("Triggers");
		
		l
		System.out.println("git add .");
		System.out.println("git commit -m "+"My commit"+"");
		System.out.println("git remote origin main "+"https:"+"");
		System.out.println();
		
	}
}




