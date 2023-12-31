package com.github.hiuchida.kabusapi.enums.symbolname.option;

/**
 * コール or プットコード。
 */
public enum PutOrCallCode {
	PUT("P"), CALL("C");

	private String code;

	private PutOrCallCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return code;
	}

	public static PutOrCallCode valueOfCode(String code) {
		for (PutOrCallCode e : values()) {
			if (e.code.equals(code)) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant code=" + code);
	}

}
