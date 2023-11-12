package com.github.hiuchida.kabusapi.enums.symbolname.future;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class FutureCodeTest {

	@Test
	public void toStringTest() {
		assertEquals("NK225", FutureCode.日経平均先物.toString());
		assertEquals("NK225mini", FutureCode.日経225mini先物.toString());
		assertEquals("TOPIX", FutureCode.TOPIX先物.toString());
		assertEquals("TOPIXmini", FutureCode.ミニTOPIX先物.toString());
		assertEquals("GROWTH", FutureCode.グロース250先物.toString());
		assertEquals("JPX400", FutureCode.JPX日経400先物.toString());
		assertEquals("DOW", FutureCode.NYダウ先物.toString());
		assertEquals("VI", FutureCode.日経平均VI先物.toString());
		assertEquals("Core30", FutureCode.TOPIXCore30先物.toString());
		assertEquals("REIT", FutureCode.東証REIT指数先物.toString());
		assertEquals("NK225micro", FutureCode.日経225マイクロ先物.toString());
	}

	@Test
	public void valueOfCodeTest() {
		assertEquals(FutureCode.日経平均先物, FutureCode.valueOfCode("NK225"));
		assertEquals(FutureCode.日経225mini先物, FutureCode.valueOfCode("NK225mini"));
		assertEquals(FutureCode.TOPIX先物, FutureCode.valueOfCode("TOPIX"));
		assertEquals(FutureCode.ミニTOPIX先物, FutureCode.valueOfCode("TOPIXmini"));
		assertEquals(FutureCode.グロース250先物, FutureCode.valueOfCode("GROWTH"));
		assertEquals(FutureCode.JPX日経400先物, FutureCode.valueOfCode("JPX400"));
		assertEquals(FutureCode.NYダウ先物, FutureCode.valueOfCode("DOW"));
		assertEquals(FutureCode.日経平均VI先物, FutureCode.valueOfCode("VI"));
		assertEquals(FutureCode.TOPIXCore30先物, FutureCode.valueOfCode("Core30"));
		assertEquals(FutureCode.東証REIT指数先物, FutureCode.valueOfCode("REIT"));
		assertEquals(FutureCode.日経225マイクロ先物, FutureCode.valueOfCode("NK225micro"));
	}

	@Test
	public void valueOfCodeTest2() {
		try {
			FutureCode.valueOfCode("XXX");
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
