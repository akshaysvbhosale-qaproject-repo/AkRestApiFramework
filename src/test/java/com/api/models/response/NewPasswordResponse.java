package com.api.models.response;

public class NewPasswordResponse {
	
	private String message;
	
	public NewPasswordResponse(){
		
	}

	public NewPasswordResponse(String message) {
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
		return "NewPasswordResponse [message=" + message + "]";
	}
	
}
