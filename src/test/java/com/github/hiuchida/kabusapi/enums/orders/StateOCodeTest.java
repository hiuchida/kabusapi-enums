package com.github.hiuchida.kabusapi.enums.orders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class StateOCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(1, StateOCode.待機.intValue());
		assertEquals(2, StateOCode.処理中.intValue());
		assertEquals(3, StateOCode.処理済.intValue());
		assertEquals(4, StateOCode.訂正取消送信中.intValue());
		assertEquals(5, StateOCode.終了.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("1", StateOCode.待機.toString());
		assertEquals("2", StateOCode.処理中.toString());
		assertEquals("3", StateOCode.処理済.toString());
		assertEquals("4", StateOCode.訂正取消送信中.toString());
		assertEquals("5", StateOCode.終了.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(null, StateOCode.valueOf((Integer) null));
		assertEquals(StateOCode.待機, StateOCode.valueOf(1));
		assertEquals(StateOCode.処理中, StateOCode.valueOf(2));
		assertEquals(StateOCode.処理済, StateOCode.valueOf(3));
		assertEquals(StateOCode.訂正取消送信中, StateOCode.valueOf(4));
		assertEquals(StateOCode.終了, StateOCode.valueOf(5));
	}

	@Test
	public void valueOfTest2() {
		try {
			StateOCode.valueOf(-1);
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
