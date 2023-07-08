package com.github.hiuchida.kabusapi.enums.commons;

/**
 * 商品コード。
 */
public enum ProductCode {
	すべて(0), 現物(1), 信用(2), 先物(3), OP(4);

	private int id;

	private ProductCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static ProductCode valueOf(int id) {
		for (ProductCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
