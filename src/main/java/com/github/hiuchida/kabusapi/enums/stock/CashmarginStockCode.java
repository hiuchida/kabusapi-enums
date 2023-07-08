package com.github.hiuchida.kabusapi.enums.stock;

/**
 * 取引区分コード（株式用）。
 */
public enum CashmarginStockCode {
	現物(1), 新規(2), 返済(3);

	private int id;

	private CashmarginStockCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static CashmarginStockCode valueOf(int id) {
		for (CashmarginStockCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
