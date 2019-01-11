package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		String text = "sample1";
		App obj = new App();
		assertEquals(text, obj.Sample());
	}

}
