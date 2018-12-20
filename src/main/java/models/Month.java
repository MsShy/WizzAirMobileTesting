package models;

import java.util.HashMap;
import java.util.Map;

public enum Month {
	JANUARY(1, "January"),
	FEBRUARY(2, "February"),
	MARCH(3, "March"),
	APRIL(4, "April"),
	MAY(5, "May"),
	JUNE(6, "June"),
	JULY(7, "July"),
	AUGUST(8, "August"),
	SEPTEMBER(9, "September"),
	OCTOBER(10, "October"),
	NOVEMBER(11, "November"),
	DECEMBER(12, "December");

	private final int code;
	private final String month;

	private static final Map<Integer, String> mapMonth = new HashMap<Integer, String>();

	static {
		for (Month s : Month.values()) {
			mapMonth.put(s.code, s.month);
		}
	}

	Month(int code, String description) {
		this.code = code;
		this.month = description;
	}

	public int getCode() {
		return code;
	}

	public String getMonth() {
		return month;
	}

	public String getMonthByCode(int code) {

		int key;
		if (code > 12) {
			key=1;
		}
		else {
			key=code;
		}
		return mapMonth.get(key);
	}

}
