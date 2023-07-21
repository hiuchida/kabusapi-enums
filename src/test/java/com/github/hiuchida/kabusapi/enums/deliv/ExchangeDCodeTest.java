package com.github.hiuchida.kabusapi.enums.deliv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ExchangeDCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(2, ExchangeDCode.日通し.intValue());
		assertEquals(23, ExchangeDCode.日中.intValue());
		assertEquals(24, ExchangeDCode.夜間.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("2", ExchangeDCode.日通し.toString());
		assertEquals("23", ExchangeDCode.日中.toString());
		assertEquals("24", ExchangeDCode.夜間.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(ExchangeDCode.日通し, ExchangeDCode.valueOf(2));
		assertEquals(ExchangeDCode.日中, ExchangeDCode.valueOf(23));
		assertEquals(ExchangeDCode.夜間, ExchangeDCode.valueOf(24));
	}

	@Test
	public void valueOfTest2() {
		try {
			ExchangeDCode.valueOf(-1);
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
