package com.api.models.request;

public class NewPasswordRequest {
	private String userEmail;
	private String userPassword;
	private String confirmPassword;

	public NewPasswordRequest(String userEmail, String userPassword, String confirmPassword) {
		super();
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.confirmPassword = confirmPassword;

	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "NewPasswordRequest [userEmail=" + userEmail + ", userPassword=" + userPassword + ", confirmPassword="
				+ confirmPassword + "]";
	}

	public static class Builder {

		private String userEmail;
		private String userPassword;
		private String confirmPassword;

		public Builder userEmail(String userEmail) {
			this.userEmail = userEmail;
			return this;
		}

		public Builder userPassword(String userPassword) {
			this.userPassword = userPassword;
			return this;
		}

		public Builder confirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
			return this;

		}

		 public NewPasswordRequest build() {
			NewPasswordRequest newPasswordRequest = new NewPasswordRequest(userEmail, userPassword, confirmPassword);
			return newPasswordRequest;
		}

	}

}
