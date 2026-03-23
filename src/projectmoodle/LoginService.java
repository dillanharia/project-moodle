package projectmoodle;

public class LoginService {

	private final String validUsername;
	private final String validPassword;
	
	public LoginService() {
		validUsername = "dillanharia";
		validPassword = "dino123";
	}
	
	public boolean authenticate (String username, String password) {
		return username.equals(validUsername) && password.equals(validPassword);
	}
	
	
}
