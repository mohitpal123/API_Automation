package utils;

import com.relevantcodes.extentreports.LogStatus;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class RestUtilities extends ExtentReportListener {

    public static String generatePayloadString(String fileName) {
        String filePath = "src/test/resources/" + fileName;
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Response PostRequest(String uRI, String payload, String Authorization,Boolean logs) {

        Response initialResponse = RestAssured.given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .header("Authorization", Authorization)
                .body(payload)
                .post(uRI);

        System.out.println("Authorization is: " + Authorization);
        test.log(LogStatus.INFO, "Authorization is: " + Authorization);
        System.out.println("Payload is: " + payload);
        test.log(LogStatus.INFO, "Payload is: " + payload);
        System.out.println("End point is: " + uRI);
        test.log(LogStatus.INFO, "End point is: " + uRI);

        if (initialResponse.getStatusCode() == 307) {
            String redirectUrl = initialResponse.getHeader("Location");

            Response finalResponse = RestAssured.given()
                    .relaxedHTTPSValidation()
                    .header("Content-Type", "application/json")
                    .body(payload)
                    .header("Authorization", Authorization)
                    .post(redirectUrl);

            return finalResponse;
        }
        return initialResponse;
    }


    public static Response DeleteRequest(String uRI, String payload, String Authorization,Boolean logs) {

        Response initialResponse = RestAssured.given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .header("Authorization", Authorization)
                .body(payload)
                .delete(uRI);

        System.out.println("Authorization is: " + Authorization);
        test.log(LogStatus.INFO, "Authorization is: " + Authorization);
        System.out.println("Payload is: " + payload);
        test.log(LogStatus.INFO, "Payload is: " + payload);
        System.out.println("End point is: " + uRI);
        test.log(LogStatus.INFO, "End point is: " + uRI);

        if (initialResponse.getStatusCode() == 307) {
            String redirectUrl = initialResponse.getHeader("Location");

            Response finalResponse = RestAssured.given()
                    .relaxedHTTPSValidation()
                    .header("Content-Type", "application/json")
                    .body(payload)
                    .header("Authorization", Authorization)
                    .delete(redirectUrl);

            return finalResponse;
        }
        return initialResponse;
    }

    public static Response UpdateRequest(String uRI, String payload, String Authorization,Boolean logs) {

        Response initialResponse = RestAssured.given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .header("Authorization", Authorization)
                .body(payload)
                .put(uRI);

        System.out.println("Authorization is: " + Authorization);
        test.log(LogStatus.INFO, "Authorization is: " + Authorization);
        System.out.println("Payload is: " + payload);
        test.log(LogStatus.INFO, "Payload is: " + payload);
        System.out.println("End point is: " + uRI);
        test.log(LogStatus.INFO, "End point is: " + uRI);

        if (initialResponse.getStatusCode() == 307) {
            String redirectUrl = initialResponse.getHeader("Location");

            Response finalResponse = RestAssured.given()
                    .relaxedHTTPSValidation()
                    .header("Content-Type", "application/json")
                    .body(payload)
                    .header("Authorization", Authorization)
                    .put(redirectUrl);

            return finalResponse;
        }
        return initialResponse;
    }

    public static Response UpdateAdgroupRequest(String uRI, String payload, String Authorization,Boolean logs) {

        Response initialResponse = RestAssured.given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .header("Authorization", Authorization)
                .body(payload)
                .put(uRI);

        System.out.println("Authorization is: " + Authorization);
        test.log(LogStatus.INFO, "Authorization is: " + Authorization);
        System.out.println("Payload is: " + payload);
        test.log(LogStatus.INFO, "Payload is: " + payload);
        System.out.println("End point is: " + uRI);
        test.log(LogStatus.INFO, "End point is: " + uRI);

        if (initialResponse.getStatusCode() == 307) {
            String redirectUrl = initialResponse.getHeader("Location");

            Response finalResponse = RestAssured.given()
                    .relaxedHTTPSValidation()
                    .header("Content-Type", "application/json")
                    .body(payload)
                    .header("Authorization", Authorization)
                    .put(redirectUrl);

            return finalResponse;
        }
        return initialResponse;
    }

    public static Response UpdateAdTargetingRequest(String uRI, String payload, String Authorization,Boolean logs) {

        Response initialResponse = RestAssured.given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .header("Authorization", Authorization)
                .body(payload)
                .put(uRI);

        System.out.println("Authorization is: " + Authorization);
        test.log(LogStatus.INFO, "Authorization is: " + Authorization);
        System.out.println("Payload is: " + payload);
        test.log(LogStatus.INFO, "Payload is: " + payload);
        System.out.println("End point is: " + uRI);
        test.log(LogStatus.INFO, "End point is: " + uRI);

        if (initialResponse.getStatusCode() == 307) {
            String redirectUrl = initialResponse.getHeader("Location");

            Response finalResponse = RestAssured.given()
                    .relaxedHTTPSValidation()
                    .header("Content-Type", "application/json")
                    .body(payload)
                    .header("Authorization", Authorization)
                    .put(redirectUrl);

            return finalResponse;
        }
        return initialResponse;
    }

    public static Response UpdateAddingNewAdTargetingKeywordRequest(String uRI, String payload, String Authorization,Boolean logs) {

        Response initialResponse = RestAssured.given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .header("Authorization", Authorization)
                .body(payload)
                .put(uRI);

        System.out.println("Authorization is: " + Authorization);
        test.log(LogStatus.INFO, "Authorization is: " + Authorization);
        System.out.println("Payload is: " + payload);
        test.log(LogStatus.INFO, "Payload is: " + payload);
        System.out.println("End point is: " + uRI);
        test.log(LogStatus.INFO, "End point is: " + uRI);

        if (initialResponse.getStatusCode() == 307) {
            String redirectUrl = initialResponse.getHeader("Location");

            Response finalResponse = RestAssured.given()
                    .relaxedHTTPSValidation()
                    .header("Content-Type", "application/json")
                    .body(payload)
                    .header("Authorization", Authorization)
                    .put(redirectUrl);

            return finalResponse;
        }
        return initialResponse;
    }

    public static Response ProductTargetRecommendationRequest(String uRI, String payload, String Authorization,Boolean logs) {

        Response initialResponse = RestAssured.given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .header("Authorization", Authorization)
                .body(payload)
                .post(uRI);

        System.out.println("Authorization is: " + Authorization);
        test.log(LogStatus.INFO, "Authorization is: " + Authorization);
        System.out.println("Payload is: " + payload);
        test.log(LogStatus.INFO, "Payload is: " + payload);
        System.out.println("End point is: " + uRI);
        test.log(LogStatus.INFO, "End point is: " + uRI);

        if (initialResponse.getStatusCode() == 307) {
            String redirectUrl = initialResponse.getHeader("Location");

            Response finalResponse = RestAssured.given()
                    .relaxedHTTPSValidation()
                    .header("Content-Type", "application/json")
                    .body(payload)
                    .header("Authorization", Authorization)
                    .post(redirectUrl);

            return finalResponse;
        }
        return initialResponse;
    }

    public static Response KeywordTargetRecommendationRequest(String uRI, String payload, String Authorization,Boolean logs) {

        Response initialResponse = RestAssured.given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .header("Authorization", Authorization)
                .body(payload)
                .post(uRI);

        System.out.println("Authorization is: " + Authorization);
        test.log(LogStatus.INFO, "Authorization is: " + Authorization);
        System.out.println("Payload is: " + payload);
        test.log(LogStatus.INFO, "Payload is: " + payload);
        System.out.println("End point is: " + uRI);
        test.log(LogStatus.INFO, "End point is: " + uRI);

        if (initialResponse.getStatusCode() == 307) {
            String redirectUrl = initialResponse.getHeader("Location");

            Response finalResponse = RestAssured.given()
                    .relaxedHTTPSValidation()
                    .header("Content-Type", "application/json")
                    .body(payload)
                    .header("Authorization", Authorization)
                    .post(redirectUrl);

            return finalResponse;
        }
        return initialResponse;
    }

    public static Response SDCreateCampaignsRequest(String uRI, String payload, String Authorization,Boolean logs) {

        Response initialResponse = RestAssured.given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .header("Authorization", Authorization)
                .body(payload)
                .post(uRI);

        System.out.println("Authorization is: " + Authorization);
        test.log(LogStatus.INFO, "Authorization is: " + Authorization);
        System.out.println("Payload is: " + payload);
        test.log(LogStatus.INFO, "Payload is: " + payload);
        System.out.println("End point is: " + uRI);
        test.log(LogStatus.INFO, "End point is: " + uRI);

        if (initialResponse.getStatusCode() == 307) {
            String redirectUrl = initialResponse.getHeader("Location");

            Response finalResponse = RestAssured.given()
                    .relaxedHTTPSValidation()
                    .header("Content-Type", "application/json")
                    .body(payload)
                    .header("Authorization", Authorization)
                    .post(redirectUrl);

            return finalResponse;
        }
        return initialResponse;
    }
}