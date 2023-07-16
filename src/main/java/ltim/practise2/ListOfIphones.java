package ltim.practise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOfIphones {

	@FindBy(xpath = "//span[contains(text(), 'Apple iPhone 14')]")
	private List<WebElement> list;
	
	@FindBy(id="productTitle")
	private WebElement productTitle;
	
	public static WebDriver driver;

	public ListOfIphones(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public ArrayList giveListAndSelect(String modelName, Actions action) throws InterruptedException {
		ArrayList<String> lists = new ArrayList<>();
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				lists.add(list.get(i).getText());
				action.moveToElement(list.get(i)).perform();
				if (list.get(i).getText().equalsIgnoreCase(modelName)) {
					list.get(i).click();
					System.out.println(lists.size());
					return lists;

				}
			}
			

		}
		System.out.println(lists.size());
		Thread.sleep(5000);
		return lists;
	}
	
	public String verifyTitle() {
		Set<String> set = driver.getWindowHandles();
		for(String a : set) {
			System.out.println(a);
		}
		String s = productTitle.getText();
		
		return s;
	}

}
