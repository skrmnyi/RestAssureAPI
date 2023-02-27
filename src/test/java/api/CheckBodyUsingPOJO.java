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
        apiPrecondition.setValidRequestBodyParameters("Київ", "1", false, "10");

        List<PojoObjects> pojoList = given()
                .contentType(ContentType.JSON)
                .spec(requestSpecification)
                .body(requestBody)
                .when()
                .post("https://api.novaposhta.ua/v2.0/json/")
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("data[0].Index1", PojoObjects.class);
        System.out.println(pojoList);
        pojoList.forEach(index -> Assertions.assertTrue(index.getDescription().contains("99999")));
    }
}
