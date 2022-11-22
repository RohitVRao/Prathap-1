package scripts;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FluentWait w = new FluentWait<>(driver);
		w.pollingEvery(Duration.ofMillis(250));
		w.withTimeout(Duration.ofSeconds(10));
		w.ignoring(NoSuchElementException.class);
		
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("woodlandshoes");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.close();
	}
}
