package com.github.hiuchida.kabusapi.enums.commons;

/**
 * 以上／以下コード。
 */
public enum UnderOverCode {
	以下(1), 以上(2);

	private int id;

	private UnderOverCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static UnderOverCode valueOf(int id) {
		for (UnderOverCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
