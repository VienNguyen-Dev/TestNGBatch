package batchtesting;

import org.testng.annotations.Test;

public class PaymentTest {
public static void main(String[] args) {
	paymentInDollor();
	paymentInruppess();

}
@Test
public static void paymentInruppess() {
	System.out.println("Payment in ruppes");
	
}
@Test
public static void paymentInDollor() {
	System.out.println("Payment in dollor");
	
}
}
