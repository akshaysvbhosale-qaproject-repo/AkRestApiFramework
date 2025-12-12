package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class LoginApiTest {

	@Test(description = "Verify if Login API is working")
	public void loginTest() {
		/*
		 * Response response = given() .baseUri("https://rahulshettyacademy.com")
		 * .header("Content-Type", "application/json") .body(
		 * "{\"userEmail\":\"akspractice.qa@gmail.com\",\"userPassword\":\"AKpractice@54\"}")
		 * .post("/api/ecom/auth/login");
		 */

		LoginRequest loginRequest = new LoginRequest("akspractice.qa@gmail.com", "AKpractice@54");

		AuthService authService = new AuthService();

		Response response = authService.login(loginRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);

		LoginResponse loginResponse = response.as(LoginResponse.class);

		System.out.println(loginResponse.getToken());

		Assert.assertTrue(loginResponse.getToken() != null);
		Assert.assertTrue(loginResponse.getUserId() != null);
		Assert.assertEquals(loginResponse.getMessage(), "Login Successfully");
	}

}
