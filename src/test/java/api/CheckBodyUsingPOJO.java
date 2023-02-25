package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static api.ApiRequestPrecondition.requestBody;
import static io.restassured.RestAssured.given;

public class CheckBodyUsingPOJO extends ConfigApiTest {
    @Test
    public void checkBodyUsingPOJO() {
        ApiRequestPrecondition apiPrecondition = new ApiRequestPrecondition();
        apiPrecondition.setValidRequestBodyParameters("Київ", "1", false, "10");

        List<Location> checkList = given()
                .spec(requestSpecification) // using defined specification
                .body(requestBody)
                .contentType(ContentType.JSON)
                .post()
                .then().log().all()
                .spec(responseSpecification)
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("data[0].Index1", Location.class);
        checkList.forEach(index -> Assertions.assertTrue(index.getIndex1().contains("99999")));

    }
}
