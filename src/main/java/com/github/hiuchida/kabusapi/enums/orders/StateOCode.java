package com.github.hiuchida.kabusapi.enums.orders;

/**
 * 状態コード（注文約定照会用）。
 */
public enum StateOCode {
	待機(1), 処理中(2), 処理済(3), 訂正取消送信中(4), 終了(5);

	private int id;

	private StateOCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static StateOCode valueOf(Integer id) {
		if (id == null) {
			return null;
		}
		for (StateOCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
