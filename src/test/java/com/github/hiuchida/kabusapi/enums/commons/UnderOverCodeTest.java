package com.github.hiuchida.kabusapi.enums.commons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class UnderOverCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(1, UnderOverCode.以下.intValue());
		assertEquals(2, UnderOverCode.以上.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("1", UnderOverCode.以下.toString());
		assertEquals("2", UnderOverCode.以上.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(UnderOverCode.以下, UnderOverCode.valueOf(1));
		assertEquals(UnderOverCode.以上, UnderOverCode.valueOf(2));
	}

	@Test
	public void valueOfTest2() {
		try {
			UnderOverCode.valueOf(-1);
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
