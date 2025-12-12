package com.api.models.request;

public class RegisterRequest {

	private String userEmail;
	private String firstName;
	private String lastName;
	private String userMobile;
	private String occupation;
	private String gender;
	private boolean required;
	private String userPassword;
	private String confirmPassword;
	private String userRole;

	public RegisterRequest(String userEmail, String firstName, String lastName, String userMobile, String occupation,
			String gender, boolean required, String userPassword, String confirmPassword, String userRole) {
		super();
		this.userEmail = userEmail;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userMobile = userMobile;
		this.occupation = occupation;
		this.gender = gender;
		this.required = required;
		this.userPassword = userPassword;
		this.confirmPassword = confirmPassword;
		this.userRole = userRole;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
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

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "RegisterRequest [userEmail=" + userEmail + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userMobile=" + userMobile + ", occupation=" + occupation + ", gender=" + gender + ", required="
				+ required + ", userPassword=" + userPassword + ", confirmPassword=" + confirmPassword + ", userRole="
				+ userRole + "]";
	}

	// Inner class with static keyword - Builder Design Pattern
	public static class Builder {
		
		private String userEmail;
		private String firstName;
		private String lastName;
		private String userMobile;
		private String occupation;
		private String gender;
		private boolean required;
		private String userPassword;
		private String confirmPassword;
		private String userRole;
		
		public Builder userEmail(String userEmail) {
			this.userEmail = userEmail;
			return this;
		}
		
		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Builder userMobile(String userMobile) {
			this.userMobile = userMobile;
			return this;
		}
		
		public Builder occupation(String occupation) {
			this.occupation = occupation;
			return this;
		}
		
		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public Builder required(boolean required) {
			this.required = required;
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
		
		public Builder userRole(String userRole) {
			this.userRole = userRole;
			return this;
		}
		
		public RegisterRequest build() {
			
			RegisterRequest registerRequest = new RegisterRequest( userEmail, firstName, lastName, userMobile, occupation, gender, required, userPassword, confirmPassword, userRole);
			return registerRequest;
		}

	}

}
