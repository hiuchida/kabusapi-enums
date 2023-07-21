package com.github.hiuchida.kabusapi.enums.orders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class OrdTypeOCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(0, OrdTypeOCode.ZERO.intValue());
		assertEquals(1, OrdTypeOCode.ザラバ.intValue());
		assertEquals(2, OrdTypeOCode.寄り.intValue());
		assertEquals(3, OrdTypeOCode.引け.intValue());
		assertEquals(4, OrdTypeOCode.不成.intValue());
		assertEquals(5, OrdTypeOCode.対当指値.intValue());
		assertEquals(6, OrdTypeOCode.IOC.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("0", OrdTypeOCode.ZERO.toString());
		assertEquals("1", OrdTypeOCode.ザラバ.toString());
		assertEquals("2", OrdTypeOCode.寄り.toString());
		assertEquals("3", OrdTypeOCode.引け.toString());
		assertEquals("4", OrdTypeOCode.不成.toString());
		assertEquals("5", OrdTypeOCode.対当指値.toString());
		assertEquals("6", OrdTypeOCode.IOC.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(null, OrdTypeOCode.valueOf((Integer) null));
		assertEquals(OrdTypeOCode.ZERO, OrdTypeOCode.valueOf(0));
		assertEquals(OrdTypeOCode.ザラバ, OrdTypeOCode.valueOf(1));
		assertEquals(OrdTypeOCode.寄り, OrdTypeOCode.valueOf(2));
		assertEquals(OrdTypeOCode.引け, OrdTypeOCode.valueOf(3));
		assertEquals(OrdTypeOCode.不成, OrdTypeOCode.valueOf(4));
		assertEquals(OrdTypeOCode.対当指値, OrdTypeOCode.valueOf(5));
		assertEquals(OrdTypeOCode.IOC, OrdTypeOCode.valueOf(6));
	}

	@Test
	public void valueOfTest2() {
		try {
			OrdTypeOCode.valueOf(-1);
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
