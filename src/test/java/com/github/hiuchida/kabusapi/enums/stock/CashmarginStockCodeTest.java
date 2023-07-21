package com.github.hiuchida.kabusapi.enums.stock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CashmarginStockCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(1, CashmarginStockCode.現物.intValue());
		assertEquals(2, CashmarginStockCode.新規.intValue());
		assertEquals(3, CashmarginStockCode.返済.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("1", CashmarginStockCode.現物.toString());
		assertEquals("2", CashmarginStockCode.新規.toString());
		assertEquals("3", CashmarginStockCode.返済.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(CashmarginStockCode.現物, CashmarginStockCode.valueOf(1));
		assertEquals(CashmarginStockCode.新規, CashmarginStockCode.valueOf(2));
		assertEquals(CashmarginStockCode.返済, CashmarginStockCode.valueOf(3));
	}

	@Test
	public void valueOfTest2() {
		try {
			CashmarginStockCode.valueOf(-1);
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
