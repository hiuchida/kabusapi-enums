package com.github.hiuchida.kabusapi.enums.deliv;

/**
 * 有効期間条件。
 */
public enum TimeInForceCode {
	FAS(1), FAK(2), FOK(3);

	private int id;

	private TimeInForceCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static TimeInForceCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (TimeInForceCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
