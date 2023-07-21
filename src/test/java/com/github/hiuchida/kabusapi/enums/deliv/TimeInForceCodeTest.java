package com.github.hiuchida.kabusapi.enums.deliv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TimeInForceCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(1, TimeInForceCode.FAS.intValue());
		assertEquals(2, TimeInForceCode.FAK.intValue());
		assertEquals(3, TimeInForceCode.FOK.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("1", TimeInForceCode.FAS.toString());
		assertEquals("2", TimeInForceCode.FAK.toString());
		assertEquals("3", TimeInForceCode.FOK.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(null, TimeInForceCode.valueOf((Integer) null));
		assertEquals(TimeInForceCode.FAS, TimeInForceCode.valueOf(1));
		assertEquals(TimeInForceCode.FAK, TimeInForceCode.valueOf(2));
		assertEquals(TimeInForceCode.FOK, TimeInForceCode.valueOf(3));
	}

	@Test
	public void valueOfTest2() {
		try {
			TimeInForceCode.valueOf(-1);
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
