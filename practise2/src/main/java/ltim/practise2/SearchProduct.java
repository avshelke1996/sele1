package ltim.practise2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement inputSearch;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchBtn;
	
	public SearchProduct(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	

	public void searchProduct(String productName) {
		inputSearch.sendKeys(productName);
	}
	
	public void searchBtnClick() {
		searchBtn.click();
	}

}
