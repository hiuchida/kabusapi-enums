package com.github.hiuchida.kabusapi.enums.orders;

/**
 * 執行条件コード（注文約定照会用）。
 */
public enum OrdTypeOCode {
	ZERO(0), ザラバ(1), 寄り(2), 引け(3), 不成(4), 対当指値(5), IOC(6);

	private int id;

	private OrdTypeOCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static OrdTypeOCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (OrdTypeOCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
