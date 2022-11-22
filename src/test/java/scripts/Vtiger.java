package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Vtiger {
	@Test
	public void create()
	{
		WebDriver driver  = new ChromeDriver();
		driver.get("http://rmgtestingserver:8888/index.php?action=index&module=Home");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		WebElement optsIndName = driver.findElement(By.xpath("//select[@name='industry']"));
		Select s1 = new Select(optsIndName);
		List<WebElement> listInd = s1.getOptions();
		for (int i =listInd.size()-1; i>=0; i--) {
			System.out.println(listInd.get(i).getText());
		}
		
		System.out.println("--------------------------");
		
		WebElement typeName = driver.findElement(By.xpath("//select[@name='accounttype']"));
		Select s2 = new Select(typeName);
		List<WebElement> listType = s2.getOptions();
		for (int i =listType.size()-1; i>=0; i--) {
			System.out.println(listType.get(i).getText());
		}
		
		
	}
	
}
