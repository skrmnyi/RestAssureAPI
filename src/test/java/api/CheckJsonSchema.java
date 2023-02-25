package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.io.File;

import static api.ApiRequestPrecondition.requestBody;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;


public class CheckJsonSchema extends ConfigApiTest {
    @Test
    public void checkJsonSchema() {
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
                .body(matchesJsonSchema(new File(System.getProperty("user.dir")+"/src/main/resources/validators/schema.json")));


    }

}