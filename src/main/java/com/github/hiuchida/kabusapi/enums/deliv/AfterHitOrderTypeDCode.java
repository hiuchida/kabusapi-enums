package com.github.hiuchida.kabusapi.enums.deliv;

/**
 * ヒット後執行条件コード。
 */
public enum AfterHitOrderTypeDCode {
	成行(1), 指値(2);

	private int id;

	private AfterHitOrderTypeDCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static AfterHitOrderTypeDCode valueOf(int id) {
		for (AfterHitOrderTypeDCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
