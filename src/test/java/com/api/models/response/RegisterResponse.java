package com.api.models.response;

public class RegisterResponse {
	
	private String message;
	
	public RegisterResponse() {
		
	}

	public RegisterResponse(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "RegisterResponse [message=" + message + "]";
	}


}
