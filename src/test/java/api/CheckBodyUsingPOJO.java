package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static api.ApiRequestPrecondition.requestBody;
import static io.restassured.RestAssured.given;

public class CheckBodyUsingPOJO extends ConfigApiTest {
    @Test
    public void checkBodyUsingPOJO() {
        ApiRequestPrecondition apiPrecondition = new ApiRequestPrecondition();
        apiPrecondition.setValidRequestBodyParameters("", "1", false, "10");
        List<Location> locationList = given()
                .spec(requestSpecification) // using defined specification
                .when()
                .contentType(ContentType.JSON).when().body(requestBody)
                .post()
                .then().log().all()
                .spec(responseSpecification)
                .extract()
                .body().jsonPath().getList("x.data[0].Description", Location.class);
        locationList.forEach(param -> Assertions.assertTrue(param.getDescription().contains("Київ")));
        System.out.println(locationList);



    }
}
