package com.github.hiuchida.kabusapi.enums.symbolname.option;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class PutOrCallCodeTest {

	@Test
	public void toStringTest() {
		assertEquals("P", PutOrCallCode.PUT.toString());
		assertEquals("C", PutOrCallCode.CALL.toString());
	}

	@Test
	public void valueOfCodeTest() {
		assertEquals(PutOrCallCode.PUT, PutOrCallCode.valueOfCode("P"));
		assertEquals(PutOrCallCode.CALL, PutOrCallCode.valueOfCode("C"));
	}

	@Test
	public void valueOfCodeTest2() {
		try {
			PutOrCallCode.valueOfCode("XXX");
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
