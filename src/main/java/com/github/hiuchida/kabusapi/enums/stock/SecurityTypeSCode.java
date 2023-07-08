package com.github.hiuchida.kabusapi.enums.stock;

/**
 * 商品種別。
 */
public enum SecurityTypeSCode {
	株式(1);

	private int id;

	private SecurityTypeSCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static SecurityTypeSCode valueOf(int id) {
		for (SecurityTypeSCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
