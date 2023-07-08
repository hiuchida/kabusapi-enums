package com.github.hiuchida.kabusapi.enums.orders;

/**
 * 取引区分コード（注文約定照会用）。
 */
public enum CashmarginOCode {
	新規(2), 返済(3);

	private int id;

	private CashmarginOCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static CashmarginOCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (CashmarginOCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
