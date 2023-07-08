package com.github.hiuchida.kabusapi.enums.orders;

/**
 * 明細種別コード（注文約定照会用）。
 */
public enum RecTypeOCode {
	受付(1), 繰越(2), 期限切れ(3), 発注(4), 訂正(5), 取消(6), 失効(7), 約定(8);

	private int id;

	private RecTypeOCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static RecTypeOCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (RecTypeOCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
