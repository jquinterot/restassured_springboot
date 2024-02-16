package com.test.RestAssuredSpringboot;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import objects.Bitcoin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;
import java.util.List;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;


@SpringBootTest
class SpringBasicApplicationTests {

	@Value("${LIST}")
	List<String> list;

	@Test
	void contextLoads() {
		System.out.println(this.list);
	}

	@Value("${BITCOIN_URL}")
	String bitcoinUrl;

	@Test
	public void checkBitcoinSchema(){
		System.out.println("Testing with restassured OMG");
		when().request("GET", bitcoinUrl).then().statusCode(200).assertThat().
				body(matchesJsonSchemaInClasspath("schemas/bitcoin.json"))
				.body("disclaimer", equalTo("This data was produced from the CoinDesk Bitcoin Price Index (USD). Non-USD currency data converted using hourly conversion rate from openexchangerates.org"));
	}

	@Test
	public void checkBitcoinResponseBodyString(){
		ResponseBody responseBody = when().request("GET", bitcoinUrl).then().extract().response().body();
		Bitcoin bitcoin = responseBody.as(Bitcoin.class);
		System.out.println(bitcoin.getTime().getUpdated());
	}

	@Test
	public void checkBitcoinResponse() {
		Response response = when().request("GET", bitcoinUrl).then().extract().response();
		System.out.println(response.getBody().asString());
		System.out.println(response.getHeaders() + " This is a header");
		System.out.println(response.getContentType());

		List<String> teams = Arrays.asList("city", "depor", "barca");

		for(String team: teams){
			System.out.println(team);
		}

		String timeUpdated = when().request("GET", bitcoinUrl).jsonPath().getString("time.updated");
		System.out.println(timeUpdated);


	}


}
