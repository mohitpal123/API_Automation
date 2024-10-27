package baseTest;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import utils.ExtentReportListener;

@Listeners(ExtentReportListener.class)
public class BaseTest extends ExtentReportListener{


	@BeforeSuite
	public void baseTest() {
		RestAssured.registerParser("text/html", Parser.JSON);
		RestAssured.baseURI = "http://localhost:8080";

		
	}
	}

