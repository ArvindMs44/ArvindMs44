import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test5 {

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,500)");
		JS.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> Values_Locators = driver.findElements(By.xpath("//table[@id='product']//td[4]"));
		 int sum = 0;
		 for (int i = 0; i < Values_Locators.size(); i++) {
			
			  int Integer_Values = Integer.parseInt(Values_Locators.get(i).getText());
			 sum+=Integer_Values;
			  
		}
			System.out.println(sum);
			System.out.println("afsdfs");
			System.out.println("ewfsfsd");
			String text = driver.findElement(By.xpath("//div[contains(text(),'Total Amount Collected: 296')]")).getText().split(":")[1].trim();
			int Expected = Integer.parseInt(text);
			Assert.assertEquals(Expected,sum);
		driver.close();
	}

}
