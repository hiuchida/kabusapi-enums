package com.github.hiuchida.kabusapi.enums.orders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CashmarginOCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(2, CashmarginOCode.新規.intValue());
		assertEquals(3, CashmarginOCode.返済.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("2", CashmarginOCode.新規.toString());
		assertEquals("3", CashmarginOCode.返済.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(null, CashmarginOCode.valueOf((Integer) null));
		assertEquals(CashmarginOCode.新規, CashmarginOCode.valueOf(2));
		assertEquals(CashmarginOCode.返済, CashmarginOCode.valueOf(3));
	}

	@Test
	public void valueOfTest2() {
		try {
			CashmarginOCode.valueOf(-1);
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
