package com.github.hiuchida.kabusapi.enums.orders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExchangeOCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(1, ExchangeOCode.東証.intValue());
		assertEquals(3, ExchangeOCode.名証.intValue());
		assertEquals(5, ExchangeOCode.福証.intValue());
		assertEquals(6, ExchangeOCode.札証.intValue());
		assertEquals(9, ExchangeOCode.SOR.intValue());
		assertEquals(2, ExchangeOCode.日通し.intValue());
		assertEquals(23, ExchangeOCode.日中.intValue());
		assertEquals(24, ExchangeOCode.夜間.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("1", ExchangeOCode.東証.toString());
		assertEquals("3", ExchangeOCode.名証.toString());
		assertEquals("5", ExchangeOCode.福証.toString());
		assertEquals("6", ExchangeOCode.札証.toString());
		assertEquals("9", ExchangeOCode.SOR.toString());
		assertEquals("2", ExchangeOCode.日通し.toString());
		assertEquals("23", ExchangeOCode.日中.toString());
		assertEquals("24", ExchangeOCode.夜間.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(null, ExchangeOCode.valueOf((Integer) null));
		assertEquals(ExchangeOCode.東証, ExchangeOCode.valueOf(1));
		assertEquals(ExchangeOCode.名証, ExchangeOCode.valueOf(3));
		assertEquals(ExchangeOCode.福証, ExchangeOCode.valueOf(5));
		assertEquals(ExchangeOCode.札証, ExchangeOCode.valueOf(6));
		assertEquals(ExchangeOCode.SOR, ExchangeOCode.valueOf(9));
		assertEquals(ExchangeOCode.日通し, ExchangeOCode.valueOf(2));
		assertEquals(ExchangeOCode.日中, ExchangeOCode.valueOf(23));
		assertEquals(ExchangeOCode.夜間, ExchangeOCode.valueOf(24));
	}

}
