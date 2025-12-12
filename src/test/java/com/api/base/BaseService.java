package com.api.base;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	/* This will be wrapper for Rest Assured
	 * The BaseURI will be initialized here. 
	 * The RequestSpecification will be created here
	 * This will be used for handling the Responses
	 */

	private static final String BASE_URL = "https://rahulshettyacademy.com";
	private RequestSpecification requestSpecification;

	public BaseService() {
		super();
		requestSpecification = given().baseUri(BASE_URL);
	}

	protected Response postRequest(Object payload, String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}

}
