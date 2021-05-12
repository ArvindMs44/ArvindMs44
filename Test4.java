import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;

public class Test4 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		TakesScreenshot TS = (TakesScreenshot)driver;
		File SrcFile = TS.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("D:\\New folder\\Test.png");
        FileUtils.copyFile(SrcFile, DestFile);
		Actions Action = new Actions(driver);
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		WebElement Footer_driver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		List<WebElement> Footer_Links = Footer_driver.findElements(By.tagName("a"));
		System.out.println(Footer_Links.size());
		WebElement Column_driver = Footer_driver.findElement(By.xpath("//tbody/tr[1]/td[1]/ul[1]"));
		List<WebElement> Column_Links = Column_driver.findElements(By.tagName("a"));
		System.out.println(Column_Links.size());
		for(WebElement Column_Link:Column_Links)
		{
			System.out.println(Column_Link.getText());
			Column_Link.sendKeys(Keys.CONTROL,Keys.ENTER);
		}
		Set<String> Windows = driver.getWindowHandles();
		Iterator<String> Iterator = Windows.iterator();
		while (Iterator.hasNext()) 
		{
			String Child_Tab = Iterator.next();
			driver.switchTo().window(Child_Tab);
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}

}
