package Api_Test;
import baseTest.BaseTest;
import com.relevantcodes.extentreports.LogStatus;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertiesReader;
import utils.RestUtilities;

public class PostApi extends BaseTest {

	String validToken = PropertiesReader.readData("validToken");
	String invalidToken = PropertiesReader.readData("invalidToken");

	@Test
	public void PostTest() {
		String payload = RestUtilities.generatePayloadString("createCampaigns/DummyData.json");
		String endpoint = PropertiesReader.readData("URL");
		Response response = RestUtilities.PostRequest(endpoint, payload, validToken, true);
		System.out.println("response is = " + response.asString());
		Assert.assertEquals(response.getStatusCode(), 201);
		test.log(LogStatus.INFO, "Status code is: " + response.getStatusCode());
		System.out.println("Status code is  :" + response.getStatusCode());

	}

}