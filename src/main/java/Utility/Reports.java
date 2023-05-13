package Utility;

import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.Status;

public class Reports {

	static ExtentReports extent;
	static ExtentTest test;
	static ITestResult result;

	/*
	 * Write in @BeforeTest
	 */
	public static ExtentReports GenrateReports(String EnterReportName) {

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(EnterReportName + ".html");
		extent = new ExtentReports(); // also known as Engine
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("Machine", "LenvoG50"); // add the System info like Build, system,tester
		extent.setSystemInfo("Env", "Testing");
		extent.setSystemInfo("Testing On", "jalatechnologies");
		extent.setSystemInfo("Build", "Functionl");
		extent.setSystemInfo("Tester", "Sandip");
		return extent;

	}

	/*
	 * Write in @Test
	 */
	public static void TestName(String EnterMethodName) {
		test = extent.createTest(EnterMethodName);
	}

	/*
	 * Write @AfterMethod
	 */
	public static void PostExcution() {

		if (result.getStatus() == ITestResult.SUCCESS) {

			test.log(Status.PASS, result.getName());
		}

		else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());

		} else {

			test.log(Status.SKIP, result.getName());
		}

	}

	/*
	 * Write @AfterTest
	 */
	public static void PublishReport() {
		extent.flush();
	}
}
