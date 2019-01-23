package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
//Sample Test Case.
		String text = "Hello World!";
		App obj = new App();
		assertEquals(text, obj.Sample());
	}

}
