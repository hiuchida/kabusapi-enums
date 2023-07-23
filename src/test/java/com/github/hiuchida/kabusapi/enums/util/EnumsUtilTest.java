package com.github.hiuchida.kabusapi.enums.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.github.hiuchida.kabusapi.enums.commons.ExchangeCode;
import com.github.hiuchida.kabusapi.enums.commons.ProductCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.orders.CashmarginOCode;
import com.github.hiuchida.kabusapi.enums.orders.StateOCode;
import com.github.hiuchida.kabusapi.enums.symbolname.future.FutureCode;
import com.github.hiuchida.kabusapi.enums.symbolname.option.OptionCode;
import com.github.hiuchida.kabusapi.enums.symbolname.option.PutOrCallCode;

public class EnumsUtilTest {

	@Test
	public void intValueExchangeCodeTest() {
		ExchangeCode exchange = ExchangeCode.東証;
		Integer a1 = EnumsUtil.intValue(exchange);
		assertEquals(exchange.intValue(), (int) a1);

		exchange = null;
		Integer a2 = EnumsUtil.intValue(exchange);
		assertNull(a2);
	}

	@Test
	public void toStringCashmarginOCodeTest() {
		CashmarginOCode cashmargin = CashmarginOCode.新規;
		String s1 = EnumsUtil.toString(cashmargin);
		assertEquals(cashmargin.toString(), s1);

		cashmargin = null;
		String s2 = EnumsUtil.toString(cashmargin);
		assertNull(s2);
	}

	@Test
	public void toStringFutureCodeTest() {
		FutureCode futureCode = FutureCode.日経平均先物;
		String s1 = EnumsUtil.toString(futureCode);
		assertEquals(futureCode.toString(), s1);

		futureCode = null;
		String s2 = EnumsUtil.toString(futureCode);
		assertNull(s2);
	}

	@Test
	public void toStringOptionCodeTest() {
		OptionCode optionCode = OptionCode.日経225オプション;
		String s1 = EnumsUtil.toString(optionCode);
		assertEquals(optionCode.toString(), s1);

		optionCode = null;
		String s2 = EnumsUtil.toString(optionCode);
		assertNull(s2);
	}

	@Test
	public void toStringProductCodeTest() {
		ProductCode product = ProductCode.現物;
		String s1 = EnumsUtil.toString(product);
		assertEquals(product.toString(), s1);

		product = null;
		String s2 = EnumsUtil.toString(product);
		assertNull(s2);
	}

	@Test
	public void toStringPutOrCallCodeTest() {
		PutOrCallCode putOrCall = PutOrCallCode.CALL;
		String s1 = EnumsUtil.toString(putOrCall);
		assertEquals(putOrCall.toString(), s1);

		putOrCall = null;
		String s2 = EnumsUtil.toString(putOrCall);
		assertNull(s2);
	}

	@Test
	public void toStringSideCodeTest() {
		SideCode side = SideCode.買;
		String s1 = EnumsUtil.toString(side);
		assertEquals(side.toString(), s1);

		side = null;
		String s2 = EnumsUtil.toString(side);
		assertNull(s2);
	}

	@Test
	public void toStringStateOCodeTest() {
		StateOCode state = StateOCode.待機;
		String s1 = EnumsUtil.toString(state);
		assertEquals(state.toString(), s1);

		state = null;
		String s2 = EnumsUtil.toString(state);
		assertNull(s2);
	}

}
