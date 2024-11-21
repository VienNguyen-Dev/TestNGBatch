package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {
	
	
	@Override
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			super.onTestStart(result);
			System.out.println("Test Started");
		
		}
	
	@Override
	public void onTestSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		System.out.println("Test Passed");
		super.onTestSuccess(tr);
	}
	
	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Failed");
		// TODO Auto-generated method stub
		super.onTestFailure(tr);
	}
	@Override
	public void onTestSkipped(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSkipped(tr);
		
		System.out.println("Test Skipped");
	}

}
