package projectmoodle;

public class Game {
	
	public void start() {
        LoginService loginService = new LoginService();
        
        System.out.println(loginService.authenticate("dillanharia", "dino123"));
        System.out.println(loginService.authenticate("wrongUser", "wrongPass"));
        
	}
}
