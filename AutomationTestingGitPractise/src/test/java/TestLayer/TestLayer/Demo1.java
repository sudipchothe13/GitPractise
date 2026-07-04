package TestLayer.TestLayer;

import org.testng.annotations.Test;

public class Demo1 {

	
	
	@Test (groups = {"@Regression", "@SendRequest"})
	public void demo() {
		System.out.println("Git practise");
	}
}
