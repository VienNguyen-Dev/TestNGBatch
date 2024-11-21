package sanitytest;

import org.testng.annotations.Test;

public class BatchTestDemo {
	
	@Test
	public static void test1() {
		System.out.println("This is the first test");
	}
	@Test
	public static void test2() {
		System.out.println("This is the second test");
	}
public static void main(String[] args) {
test1();
test2();
}
}
