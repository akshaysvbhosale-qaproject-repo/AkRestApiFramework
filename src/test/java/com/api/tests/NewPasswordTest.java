package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.models.request.NewPasswordRequest;
import com.api.models.response.NewPasswordResponse;
import io.restassured.response.Response;

public class NewPasswordTest {
	
	@Test(description = "Verify that New Password API is working")
	
	public void newPasswordTest() {
		
		NewPasswordRequest newPasswordRequest = new NewPasswordRequest.Builder()
				.userEmail("akspractice.qa@gmail.com")
				.userPassword("AKpractice@55")
				.confirmPassword("AKpractice@55")
				.build();
		
		AuthService authService = new AuthService();
		Response response =  authService.forgotPassword(newPasswordRequest);
		System.out.println(response.asPrettyString());
		
		NewPasswordResponse newPasswordResponse = response.as(NewPasswordResponse.class);
		
		Assert.assertEquals(newPasswordResponse.getMessage(), "Password Changed Successfully");

		Assert.assertEquals(response.getStatusCode(), 200);

	}

}
