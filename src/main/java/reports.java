import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.observer.entity.MediaEntity;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reports {

	public static void main(String arg[]) {

		ExtentTest test ;
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Test_Rerport");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);

		test = extent.createTest("TC001 - Browser Setup");
		test.assignAuthor("Ibrahim");
		test.assignCategory("Smoke");
		test.pass("Launch Browser");
		test = extent.createTest("TC002 - Login");
		test.assignAuthor("Ibrahim");
		test.assignCategory("Smoke");
		test.fail(" Login as Admin");
		test = extent.createTest("TC003 - CRM");
		test.assignAuthor("Ibrahim");
		test.assignCategory("Smoke");
		test.info(" Open CRM");
		test = extent.createTest("TC004 - Campaign");
		test.assignAuthor("Ibrahim");
		test.assignCategory("Smoke");
		test.warning(" Open Campaign");
		test = extent.createTest("TC005 - Quit");
		test.assignAuthor("Ibrahim");
		test.assignCategory("Smoke");
		test.skip(" Quit");
		test = extent.createTest("TC006 - Relaunch");
		test.assignAuthor("Ibrahim");
		test.assignCategory("Smoke");
		test.fail("Relaunch", MediaEntityBuilder
				.createScreenCaptureFromPath("img.png")
				.build());

		extent.flush();
	}
}
