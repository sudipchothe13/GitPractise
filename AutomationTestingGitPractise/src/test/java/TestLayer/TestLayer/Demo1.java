package TestLayer.TestLayer;

import org.testng.annotations.Test;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Git practise with Sudip");
		System.out.println("Git practise with Sudip Chothe");
	}
	
	@Test (groups = {"Regression", "SendRequest"})
	public void demo() {
		System.out.println("Git practise");
	}
}
