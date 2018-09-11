package module6;

import org.testng.annotations.Test;

public class TestExample {

	@Test(priority = 0)
	public void Prashant() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority = 11)
	public void Amit() {
		System.out.println("This is the Test Case 2");
	}

	@Test(priority = 25)
	public void Lalitha() {
		System.out.println("This is the Test Case 3");
	}

	@Test(priority = 38, enabled = false)
	public void Sudha() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority = 44)
	public void Sindhu() {
		System.out.println("This is the Test Case 5");
	}
	
	@Test(priority = 59)
	public void Devasish() {
		System.out.println("This is the Test Case 6");
	}
}
