package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static api.ApiRequestPrecondition.requestBody;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CheckResponseForRequestWithoutMandatoryParameterTest extends ConfigApiTest {

    @Test
    public void checkResponseForRequestWithoutMandatoryParameterTest() {
        ApiRequestPrecondition apiPrecondition = new ApiRequestPrecondition();
        apiPrecondition.setRequestBodyParametersWithoutCity("1", false, "1");
        given()
                .contentType(ContentType.JSON)
                .spec(requestSpecification) // using defined specification
                .body(requestBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body("success", equalTo(false));
    }
}

