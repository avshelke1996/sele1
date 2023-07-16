package ltim.practise2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneDetails {
	
	@FindBy(id="availability")
	private WebElement isAvailable;
	
	
	public PhoneDetails(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String verfityAvailability() {
		String s = isAvailable.getText().trim();
		return s;
	}

}
