package extentreport;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GeneralExtentReport {
static	ExtentReports extent;// initial report
static	ExtentTest test; //use write content in report
static ITestResult result;
	
	@BeforeTest
	public static void startReport() {
		
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/MyOwnReport.html", true); //Where is save the report?
		extent.addSystemInfo("Host Name", "LocalHost");
		extent.addSystemInfo("Enviroment", "QA");
		extent.addSystemInfo("User Name", "VienNguyen");
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
	}
	
	
	@Test
	public static void demoReportPass() {

	test =extent.startTest("demoReportTest");
	Assert.assertTrue(true);
	test.log(LogStatus.PASS, "Assert pass as condition is True");
	}
	
	@Test
	public static void demoREportFail() {
		test =extent.startTest("demoReportFail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "Assert fail as condition is False");
	}
	
	@AfterMethod
	public static void getResult(ITestResult result) {
if (result.getStatus()== ITestResult.FAILURE) {
	test.log(LogStatus.FAIL, result.getThrowable());
} 
extent.endTest(test);
	}
	
	@AfterTest
	public static void endReport() {
		extent.flush(); //xoa extent khoi bo nho
	}
	
	
	
public static void main(String[] args) {
	startReport();
	demoReportPass();
	demoREportFail();
//	extentReport.getResult(result);
	endReport();
}
}
