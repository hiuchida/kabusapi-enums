package com.github.hiuchida.kabusapi.enums.commons;

/**
 * 売買区分コード。
 */
public enum SideCode {
	売(1), 買(2);

	private int id;

	private SideCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static SideCode valueOf(int id) {
		for (SideCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

	public static SideCode valueOfCode(String code) {
		if (code == null) {
			return null;
		}
		for (SideCode e : values()) {
			String idStr = "" + e.id;
			if (idStr.equals(code)) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant code=" + code);
	}

}
