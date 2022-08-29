import static io.restassured.RestAssured.given;

public class Test {
    @org.junit.jupiter.api.Test
    public void T1 () {
        Spec spec = new Spec();
        given()
                .log().all()
                .spec(spec.RC)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

    }

}
