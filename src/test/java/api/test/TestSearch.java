package api.test;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestSearch {

    private String BASE_URL = "https://yandex.ru";

//    @Test
//    public void Test() {
//        RestAssured.given()
//                .baseUri(BASE_URL)
//                .basePath("/search/")
//                .header("", "")
//                .contentType(ContentType.JSON) // тип контента, который нам должен вернуть веб сервис
//                .body("{\n" +
//                        " \"id\": "+1234+", \n" +
//                        " \"name\": \"abcd\", \n" +
//                        " \"status\": \"pending\", \n" +
//                        " \"tags\": [], \n" +
//                        "}")
//                .when().post()
//                .then() // здесь проверки или вывод какой либо информации или де
//                .body("id", Matchers.equalTo(1234));
//    }

    @Test
    public void Test2() {
        XmlPath doc = new XmlPath(
                XmlPath.CompatibilityMode.HTML,
        RestAssured.given()
                .baseUri(BASE_URL)
                .basePath("/search/")
                .header("text", "123")
                .contentType(ContentType.HTML).filter(new AllureRestAssured())
                .when().get().then().extract().response().body().htmlPath().prettify());

        String title = doc.getString("html.head.title");
        assertThat(title, Matchers.equalTo("Яндекс"));
    }
}
