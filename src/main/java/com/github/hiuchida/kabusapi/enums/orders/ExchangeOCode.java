package com.github.hiuchida.kabusapi.enums.orders;

/**
 * 市場コード（注文約定照会用）。
 */
public enum ExchangeOCode {
	東証(1), 名証(3), 福証(5), 札証(6), SOR(9), 日通し(2), 日中(23), 夜間(24);

	private int id;

	private ExchangeOCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static ExchangeOCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (ExchangeOCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
