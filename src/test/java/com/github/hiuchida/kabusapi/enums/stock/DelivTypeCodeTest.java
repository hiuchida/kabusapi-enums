package com.github.hiuchida.kabusapi.enums.stock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class DelivTypeCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(0, DelivTypeCode.指定なし.intValue());
		assertEquals(1, DelivTypeCode.自動振替.intValue());
		assertEquals(2, DelivTypeCode.お預り金.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("0", DelivTypeCode.指定なし.toString());
		assertEquals("1", DelivTypeCode.自動振替.toString());
		assertEquals("2", DelivTypeCode.お預り金.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(null, DelivTypeCode.valueOf((Integer) null));
		assertEquals(DelivTypeCode.指定なし, DelivTypeCode.valueOf(0));
		assertEquals(DelivTypeCode.自動振替, DelivTypeCode.valueOf(1));
		assertEquals(DelivTypeCode.お預り金, DelivTypeCode.valueOf(2));
	}

	@Test
	public void valueOfTest2() {
		try {
			DelivTypeCode.valueOf(-1);
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
