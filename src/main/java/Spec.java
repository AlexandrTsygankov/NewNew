import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Spec {
    String BaseUrl ="https://reqres.in/";
    public RequestSpecification RC = new RequestSpecBuilder()

            .setBaseUri(BaseUrl)
            .setBasePath("/api/users?page=2")
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .build();
}
