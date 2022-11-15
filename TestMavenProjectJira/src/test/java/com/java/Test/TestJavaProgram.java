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
		System.out.println("Test");
		System.out.print("Closed...");
	}

}
