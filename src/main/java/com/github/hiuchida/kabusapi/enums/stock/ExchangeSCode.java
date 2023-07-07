package com.github.hiuchida.kabusapi.enums.stock;

/**
 * 市場コード（現物／信用注文発注用）。
 */
public enum ExchangeSCode {
	東証(1), 名証(3), 福証(5), 札証(6);

	private int id;

	private ExchangeSCode(int id) {
		this.id = id;
	}

	public int intValue() {
		return id;
	}

	@Override
	public String toString() {
		return Integer.toString(id);
	}

	public static ExchangeSCode valueOf(int id) {
		for (ExchangeSCode e : values()) {
			if (e.id == id) {
				return e;
			}
		}
		throw new IllegalArgumentException("No enum constant id=" + id);
	}

}
