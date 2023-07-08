package com.github.hiuchida.kabusapi.enums.orders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecTypeOCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(1, RecTypeOCode.受付.intValue());
		assertEquals(2, RecTypeOCode.繰越.intValue());
		assertEquals(3, RecTypeOCode.期限切れ.intValue());
		assertEquals(4, RecTypeOCode.発注.intValue());
		assertEquals(5, RecTypeOCode.訂正.intValue());
		assertEquals(6, RecTypeOCode.取消.intValue());
		assertEquals(7, RecTypeOCode.失効.intValue());
		assertEquals(8, RecTypeOCode.約定.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("1", RecTypeOCode.受付.toString());
		assertEquals("2", RecTypeOCode.繰越.toString());
		assertEquals("3", RecTypeOCode.期限切れ.toString());
		assertEquals("4", RecTypeOCode.発注.toString());
		assertEquals("5", RecTypeOCode.訂正.toString());
		assertEquals("6", RecTypeOCode.取消.toString());
		assertEquals("7", RecTypeOCode.失効.toString());
		assertEquals("8", RecTypeOCode.約定.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(null, RecTypeOCode.valueOf((Integer) null));
		assertEquals(RecTypeOCode.受付, RecTypeOCode.valueOf(1));
		assertEquals(RecTypeOCode.繰越, RecTypeOCode.valueOf(2));
		assertEquals(RecTypeOCode.期限切れ, RecTypeOCode.valueOf(3));
		assertEquals(RecTypeOCode.発注, RecTypeOCode.valueOf(4));
		assertEquals(RecTypeOCode.訂正, RecTypeOCode.valueOf(5));
		assertEquals(RecTypeOCode.取消, RecTypeOCode.valueOf(6));
		assertEquals(RecTypeOCode.失効, RecTypeOCode.valueOf(7));
		assertEquals(RecTypeOCode.約定, RecTypeOCode.valueOf(8));
	}

}
