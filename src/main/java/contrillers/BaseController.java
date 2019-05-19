package contrillers;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseController {
    private RequestSpecBuilder requestSpecBuilder;

    public BaseController(RequestSpecification requestSpecification) {
        requestSpecBuilder = new RequestSpecBuilder().addRequestSpecification(requestSpecification);
    }
}
