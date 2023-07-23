package com.github.hiuchida.kabusapi.enums.symbolname.option;

/**
 * オプションコード。
 */
public enum OptionCode {
	日経225オプション("NK225op"), 日経225ミニオプション("NK225miniop");

	private String code;

	private OptionCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return code;
	}

	public static OptionCode valueOfCode(String code) {
		for (OptionCode e : values()) {
			if (e.code.equals(code)) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant code=" + code);
	}

}
