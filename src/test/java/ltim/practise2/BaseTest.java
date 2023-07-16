 package ltim.practise2;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utility.ReadProp;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop;
	public static Actions action;
	

	@BeforeSuite
	public void launchURL() throws IOException {
		
		driver = new ChromeDriver();
		prop = new Properties();
		action = new Actions(driver);
		String url = ReadProp.propertyReader("url");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterSuite
	public void afterSuite() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}

}
