package models;

public class Flight {


	private Country departureCountry;
	private Month departureMonth;
	private int departureDate;

	private Country arrivalCountry;
	private Month arrivalMonth;
	private int arrivalDate;


	public Flight() {
	}

	public Flight(final Country departureCountry, final Country arrivalCountry, final Month departureMonth,
	              final int departureDate, final Month arrivalMonth, final int arrivalDate) {
		this.departureCountry = departureCountry;
		this.departureMonth = departureMonth;
		this.departureDate = departureDate;
		this.arrivalCountry = arrivalCountry;
		this.arrivalMonth = arrivalMonth;
		this.arrivalDate = arrivalDate;
	}

	public Flight(final Country departureCountry, final Country arrivalCountry, final Month departureMonth,
	              final int departureDate) {
		this.departureCountry = departureCountry;
		this.departureMonth = departureMonth;
		this.departureDate = departureDate;
		this.arrivalCountry = arrivalCountry;

	}


	public Country getDepartureCountry() {
		return departureCountry;
	}

	public Country getArrivalCountry() {
		return arrivalCountry;
	}

	public void setDepartureCountry(final Country departureCountry) {
		this.departureCountry = departureCountry;
	}

	public void setArrivalCountry(final Country arrivalCountry) {
		this.arrivalCountry = arrivalCountry;
	}


	public Month getDepartureMonth() {
		return departureMonth;
	}

	public int getDepartureDate() {
		return departureDate;
	}

	public Month getArrivalMonth() {
		return arrivalMonth;
	}

	public int getArrivalDate() {
		return arrivalDate;
	}

	public void setDepartureMonth(final Month departureMonth) {
		this.departureMonth = departureMonth;
	}

	public void setDepartureDate(final int departureDate) {
		this.departureDate = departureDate;
	}

	public void setArrivalMonth(final Month arrivalMonth) {
		this.arrivalMonth = arrivalMonth;
	}

	public void setArrivalDate(final int arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
}
