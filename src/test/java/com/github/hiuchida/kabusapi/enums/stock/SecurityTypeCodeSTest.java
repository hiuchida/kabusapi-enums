package com.github.hiuchida.kabusapi.enums.stock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class SecurityTypeCodeSTest {

	@Test
	public void intValueTest() {
		assertEquals(1, SecurityTypeSCode.株式.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("1", SecurityTypeSCode.株式.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(SecurityTypeSCode.株式, SecurityTypeSCode.valueOf(1));
	}

	@Test
	public void valueOfTest2() {
		try {
			SecurityTypeSCode.valueOf(-1);
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
