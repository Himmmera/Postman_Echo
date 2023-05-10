import io.restassured.http.ContentType;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class Postman_EchoTest {

    @Test
     void shouldPostmanTextTest() {
        given()
                .baseUri("https://localhost:9999/api/v1")
                .when()
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("[1].currency", equalTo("USD"))
                .body("every { it.balance >= 0 }", is(true))
                .body("data", equalTo("some value"));
    }
}





