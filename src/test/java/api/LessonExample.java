package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class LessonExample {
    @Test
    public void test() {
        String key = "7b3c27088f71fa75df6d10792ac433f8";
        Map<String, Object> reqBody = new HashMap<>();
        Map<String, Object> methodProperties = new HashMap<>();
        methodProperties.put("CityName", "Київ");
        methodProperties.put("Limit", 5);

        reqBody.put("calledMethod", "searchSettlements");
        reqBody.put("methodProperties", methodProperties);
        reqBody.put("modelName", "Address");
        reqBody.put("apiKey", key);


        List<PojoObjects> pojoList = given()
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post("https://api.novaposhta.ua/v2.0/json/")
                .then()
                .extract()
                .body().jsonPath().getList("data[0].Addresses", PojoObjects.class);
        System.out.println(pojoList);
        pojoList.forEach(param-> Assertions.assertTrue(param.getPresent().contains("Київ")));

    }
}

