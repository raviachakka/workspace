package com.javacodegeeks.junitrestweb;

import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class EmployeeRestTest {
	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "https://devwebapp.cloudfuze.com/proxyservices/v1";
		//RestAssured.port = 8080;
	}

	@Test
	public void testUserFetchesSuccess() {
		Response res =get("mapping/user/domain/list?cloudId=59ad19a7e4b0b90b2a27eda3&pageNo=1&pageSize=10");
		ResponseBody<?>  responseBody =	res.getBody();
		System.out.println(responseBody.asString());
		/*.then()
		.body("id", equalTo(12))
		.body("firstName", equalTo("Ram"))
		.body("lastName", equalTo("Chandra"))
		.body("designation", equalTo("MANAGER"));*/
	}
}
