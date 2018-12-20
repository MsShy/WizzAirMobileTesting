package models;

public enum TypeOfTicket {

	BASIC("1"),
	WIZZ_GO("6"),
	WIZZ_PLUS("16");

	private String value;

	TypeOfTicket(String  value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}
