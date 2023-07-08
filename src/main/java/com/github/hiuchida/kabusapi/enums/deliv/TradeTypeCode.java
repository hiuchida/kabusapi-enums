package com.github.hiuchida.kabusapi.enums.deliv;

/**
 * 取引区分コード。
 */
public enum TradeTypeCode {
	新規(1), 返済(2);

	private int id;

	private TradeTypeCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static TradeTypeCode valueOf(int id) {
		for (TradeTypeCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
