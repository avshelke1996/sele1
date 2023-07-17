package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		
		System.out.println("retry");
		// TODO Auto-generated method stub
		return false;
	}

}
