package ltim.practise2;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.ScrollBy;

@Listeners(utility.ListenOnTestResult.class)
public class TestApp extends BaseTest {
	private static final boolean List = false;
	public static SoftAssert sa;

	static {
		sa = new SoftAssert();
	}

	@Test(priority = 0)
	public void isSiteLoaded() {
		sa.assertEquals(driver.getTitle(),
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		sa.assertAll();
	}

	@Test(priority = 1)
	public void searchProcuct() throws InterruptedException {
		SearchProduct sp = new SearchProduct(driver);
		sp.searchProduct("iphone 14");
		sp.searchBtnClick();
//		Thread.sleep(5000);
		sa.assertEquals(driver.getTitle(), "Amazon.in : iphone 14");
		sa.assertAll();
	}

	@Test(priority = 2)
	public void listOfIhones() throws InterruptedException {
		ArrayList list = null;
		ListOfIphones l = new ListOfIphones(driver);
		try {
			list = l.giveListAndSelect("Apple iPhone 14 (128 GB) - Starlight", action);
		}catch(Exception e) {
			System.out.println("error - "+e.getMessage());
		}finally {
			String title = driver.getTitle();
			Thread.sleep(5000);
			String productName = l.verifyTitle();
			sa.assertEquals("Apple iPhone 14 (128 GB) - Starlight", productName);
			sa.assertAll();
		}
		
	}
	
	@Test(priority=3)
	public void isInStock() {
		PhoneDetails d = new PhoneDetails(driver);
		ScrollBy.scrollByAxix(driver, 0, 500);
		String s= d.verfityAvailability();
//		sa.assertEquals(s, "In stock");
		Assert.assertFalse(true);
	}

}
