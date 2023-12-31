package com.github.hiuchida.kabusapi.enums.stock;

/**
 * 信用取引区分。
 */
public enum MarginTradeTypeCode {
	制度信用(1), 一般信用_長期(2), 一般信用_デイトレ(3);

	private int id;

	private MarginTradeTypeCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static MarginTradeTypeCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (MarginTradeTypeCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
