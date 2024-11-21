package batchtesting;

import org.testng.annotations.Test;

public class SignupTest {
public static void main(String[] args) {
	signupByEmail();
	signupByFacebook();
	signupByTweeter();
	

}
@Test
public static void signupByTweeter() {
	System.out.println("signup by tweeter");
	
}
@Test
public static void signupByFacebook() {
	System.out.println("signup by facbook");
	
}
@Test
public static void signupByEmail() {
	System.out.println("signup by email"); 
	
}
}
