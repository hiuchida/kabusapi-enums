package com.github.hiuchida.kabusapi.enums.util;

import com.github.hiuchida.kabusapi.enums.commons.ProductCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.orders.CashmarginOCode;
import com.github.hiuchida.kabusapi.enums.orders.StateOCode;
import com.github.hiuchida.kabusapi.enums.symbolname.future.FutureCode;
import com.github.hiuchida.kabusapi.enums.symbolname.option.PutOrCallCode;

public class EnumsUtil {

	public static String toString(CashmarginOCode cashmargin) {
		return (cashmargin != null) ? cashmargin.toString() : null;
	}

	public static String toString(FutureCode future) {
		return (future != null) ? future.toString() : null;
	}

	public static String toString(ProductCode product) {
		return (product != null) ? product.toString() : null;
	}

	public static String toString(PutOrCallCode putOrCall) {
		return (putOrCall != null) ? putOrCall.toString() : null;
	}

	public static String toString(SideCode side) {
		return (side != null) ? side.toString() : null;
	}

	public static String toString(StateOCode state) {
		return (state != null) ? state.toString() : null;
	}

	private EnumsUtil() {
	}

}
