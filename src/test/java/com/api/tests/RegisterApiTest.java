package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.RegisterRequest;
import com.api.models.response.RegisterResponse;

import io.restassured.response.Response;

public class RegisterApiTest {

	@Test(description = "Verify if Register API is working")

	public void registerTest() {

		RegisterRequest registerRequest = new RegisterRequest.Builder()
				.firstName("Akshay")
				.lastName("PracFive")
				.userEmail("akspractice.qaefive@gmail.com")
				.userRole("customer")
				.occupation("Engineer")
				.gender("Male")
				.userMobile("9678967863")
				.userPassword("AKselenium@14")
				.confirmPassword("AKselenium@14")
				.required(true)
				.build();

		AuthService authService = new AuthService();
		Response response = authService.register(registerRequest);
		System.out.println(response.asPrettyString());

		RegisterResponse registerResponse = response.as(RegisterResponse.class);

		Assert.assertEquals(registerResponse.getMessage(), "Registered Successfully");
	}

}
