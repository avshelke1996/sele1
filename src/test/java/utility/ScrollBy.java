package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import ltim.practise2.BaseTest;

public class ScrollBy extends BaseTest {
	
	public static void scrollByAxix(WebDriver driver, int xAxis, int yAxix) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+xAxis+","+yAxix+")");
	}

}
