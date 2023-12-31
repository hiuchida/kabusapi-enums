package com.github.hiuchida.kabusapi.enums.stock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class FundTypeCodeTest {

	@Test
	public void toStringTest() {
		assertEquals("  ", FundTypeCode.現物売.toString());
		assertEquals("02", FundTypeCode.保護.toString());
		assertEquals("AA", FundTypeCode.信用代用.toString());
		assertEquals("11", FundTypeCode.信用取引.toString());
	}

	@Test
	public void valueOfCodeTest() {
		assertEquals(FundTypeCode.現物売, FundTypeCode.valueOfCode("  "));
		assertEquals(FundTypeCode.保護, FundTypeCode.valueOfCode("02"));
		assertEquals(FundTypeCode.信用代用, FundTypeCode.valueOfCode("AA"));
		assertEquals(FundTypeCode.信用取引, FundTypeCode.valueOfCode("11"));
	}

	@Test
	public void valueOfCodeTest2() {
		try {
			FundTypeCode.valueOfCode("XXX");
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
