package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		String abb;
		String text = "sample";
		App obj = new App();
		assertEquals(text, obj.Sample());
	}

}
