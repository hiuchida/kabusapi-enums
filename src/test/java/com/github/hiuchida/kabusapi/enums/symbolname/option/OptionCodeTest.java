package com.github.hiuchida.kabusapi.enums.symbolname.option;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class OptionCodeTest {

	@Test
	public void toStringTest() {
		assertEquals("NK225op", OptionCode.日経225オプション.toString());
		assertEquals("NK225miniop", OptionCode.日経225ミニオプション.toString());
	}

	@Test
	public void valueOfCodeTest() {
		assertEquals(OptionCode.日経225オプション, OptionCode.valueOfCode("NK225op"));
		assertEquals(OptionCode.日経225ミニオプション, OptionCode.valueOfCode("NK225miniop"));
	}

	@Test
	public void valueOfCodeTest2() {
		try {
			OptionCode.valueOfCode("XXX");
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
