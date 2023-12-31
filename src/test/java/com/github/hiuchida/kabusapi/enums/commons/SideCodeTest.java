package com.github.hiuchida.kabusapi.enums.commons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class SideCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(1, SideCode.売.intValue());
		assertEquals(2, SideCode.買.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("1", SideCode.売.toString());
		assertEquals("2", SideCode.買.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(SideCode.売, SideCode.valueOf(1));
		assertEquals(SideCode.買, SideCode.valueOf(2));
	}

	@Test
	public void valueOfTest2() {
		try {
			SideCode.valueOf(-1);
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

	@Test
	public void valueOfCodeTest() {
		assertEquals(null, SideCode.valueOfCode(null));
		assertEquals(SideCode.売, SideCode.valueOfCode("1"));
		assertEquals(SideCode.買, SideCode.valueOfCode("2"));
	}

	@Test
	public void valueOfCodeTest2() {
		try {
			SideCode.valueOfCode("XXX");
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
