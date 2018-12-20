package models;

public enum Country {


	KYIV("Kyiv - Zhulyany"),
	WROCLAW("Wroclaw");

	private String value;

	 Country(String  value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
