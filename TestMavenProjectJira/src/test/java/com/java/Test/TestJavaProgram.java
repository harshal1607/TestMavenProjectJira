package com.java.Test;

import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.java.PageFactory.TestJava;

public class TestJavaProgram extends BaseTest {
	
	private TestJava objTestJava;
	public TestJavaProgram() {
		objTestJava = new TestJava();
	}
	
	
	@Test
	public void testJava()
	{
		objTestJava.openURLforFB();
		objTestJava.verifyFirstNameField();
		System.out.println("Test");
		System.out.print("Closed...");
	}

	@Test
	public void addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition= "+c);
	}
	
	@Test
	public void substraction() {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("Substraction= "+c);
	}
	
	@Test
	public void multiplication() {
		int a=10;
		int b=20;
		float c=a*b;
		System.out.println("Multiplication= "+c);
	}
	
	@Test
	public void division() {
		int a=10;
		int b=3;
		int c=a/b;
		if(c==0) {
			
		}
		
		System.out.println("division= "+c);
	}
}

