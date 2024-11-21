package batchtesting;

import org.testng.annotations.Test;

public class LoginTest {
public static void main(String[] args) {
	loginByEmail();
	loginByFacebook();
	loginByTweeter();
	

}
@Test
public static void loginByTweeter() {
	System.out.println("login by tweeter");
	
}
@Test
public static void loginByFacebook() {
	System.out.println("Login by facbook");
	
}
@Test
public static void loginByEmail() {
	System.out.println("login by email"); 
	
}
}
