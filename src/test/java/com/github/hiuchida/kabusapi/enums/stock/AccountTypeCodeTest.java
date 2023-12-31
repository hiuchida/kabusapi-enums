package com.github.hiuchida.kabusapi.enums.stock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AccountTypeCodeTest {

	@Test
	public void intValueTest() {
		assertEquals(2, AccountTypeCode.一般.intValue());
		assertEquals(4, AccountTypeCode.特定.intValue());
		assertEquals(12, AccountTypeCode.法人.intValue());
	}

	@Test
	public void toStringTest() {
		assertEquals("2", AccountTypeCode.一般.toString());
		assertEquals("4", AccountTypeCode.特定.toString());
		assertEquals("12", AccountTypeCode.法人.toString());
	}

	@Test
	public void valueOfTest() {
		assertEquals(null, AccountTypeCode.valueOf((Integer) null));
		assertEquals(AccountTypeCode.一般, AccountTypeCode.valueOf(2));
		assertEquals(AccountTypeCode.特定, AccountTypeCode.valueOf(4));
		assertEquals(AccountTypeCode.法人, AccountTypeCode.valueOf(12));
	}

	@Test
	public void valueOfTest2() {
		try {
			AccountTypeCode.valueOf(-1);
			fail("must throw IllegalArgumentException.");
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
		}
	}

}
