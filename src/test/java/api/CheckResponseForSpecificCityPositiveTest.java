package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static api.ApiRequestPrecondition.requestBody;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CheckResponseForSpecificCityPositiveTest extends ConfigApiTest {
    @Test
    public void checkResponseForSpecificCityPositiveTest() {
        ApiRequestPrecondition apiPrecondition = new ApiRequestPrecondition();
        apiPrecondition.setValidRequestBodyParameters("Київ", "1", true, "10");
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
                .body("success", equalTo(true));
    }
}

