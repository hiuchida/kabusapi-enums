package com.github.hiuchida.kabusapi.enums.deliv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AfterHitOrderTypeDCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(1, AfterHitOrderTypeDCode.成行.intValue());
		assertEquals(2, AfterHitOrderTypeDCode.指値.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("1", AfterHitOrderTypeDCode.成行.toString());
		assertEquals("2", AfterHitOrderTypeDCode.指値.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(AfterHitOrderTypeDCode.成行, AfterHitOrderTypeDCode.valueOf(1));
		assertEquals(AfterHitOrderTypeDCode.指値, AfterHitOrderTypeDCode.valueOf(2));
	}

	@Test
	public void valueOfTest2() {
		try {
			AfterHitOrderTypeDCode.valueOf(-1);
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
