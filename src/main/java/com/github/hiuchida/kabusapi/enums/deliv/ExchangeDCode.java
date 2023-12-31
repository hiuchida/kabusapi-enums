package com.github.hiuchida.kabusapi.enums.deliv;

/**
 * 市場コード（先物／ＯＰ注文発注用）。
 */
public enum ExchangeDCode {
	日通し(2), 日中(23), 夜間(24);

	private int id;

	private ExchangeDCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static ExchangeDCode valueOf(int id) {
		for (ExchangeDCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
