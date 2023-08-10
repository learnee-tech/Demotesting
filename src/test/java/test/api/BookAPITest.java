package test.api;

import org.junit.Test;
import io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class BookAPITest {


	@Test
	public void createBooking() {
		request = given().log().all().header("content-type","application/json")
				.body()
	}
}
