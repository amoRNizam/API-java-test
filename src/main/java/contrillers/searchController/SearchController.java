package contrillers.searchController;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RedirectSpecification;
import io.restassured.specification.RequestSpecification;
import models.ItemModel;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;

public class SearchController {

//    private RequestSpecification requestSpecification;
//
//    public SearchController() {
//        requestSpecification = new RequestSpecBuilder()
//                .addHeader("", "")
//                .setBaseUri("https://yandex.ru")
//                .setBasePath("/search/")
//                .setContentType(ContentType.JSON)
//                .log(LogDetail.ALL).build();
//    }
    private RequestSpecification requestSpecification;
    private ItemModel itemModel;

    public SearchController(ItemModel itemModel) {
        requestSpecification = new RequestSpecBuilder()
                .addHeader("api_key", "1qa2ws3ed4rfvcxz")
                .setBaseUri("http://petstore.swagger.io")
                .setBasePath("/v2/pet")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectResponseTime(Matchers.lessThan(15000L))
                .build();
        RestAssured.defaultParser = Parser.JSON;
        this.itemModel = itemModel;
    }



//    public Object getItemModel() {
//        Response response = given(requestSpecification).get(String.valueOf(itemModel.getRecordsCount()));
//        if (response.statusCode() == 200) {
//            return response.as(ItemModel.class);
//        } else {
//            return response.as(searchNotFound.class);
//        }
//    }
//
//    public searchNotFound getDeletedPet() {
//        return given(requestSpecification)
//                .get(String.valueOf(itemModel.getRecordsCount()))
//                .then()
//                .statusCode(404)
//                .and()
//                .extract().response().as(searchNotFound.class);
//
//    }
}
