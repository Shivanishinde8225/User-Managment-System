package unittesing;

public class Validate {
	public boolean check(String username,String pass) {
		if(username.equals(pass))return true;
		else return false;
	}
}
