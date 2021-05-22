package flightbooking;

public class FlightInfo {

	private String airportDep;
	private String airportArr;
	private int dateDep;
	private int dateArr;
	private int passengers;
	private String cabinClass;
	private String flightType;

	private FlightInfo(String airportDep, String airportArr, int dateDep, int dateArr, int passengers,
			String cabinClass, String flightType) {
		super();
		this.airportDep = airportDep;
		this.airportArr = airportArr;
		this.dateDep = dateDep;
		this.dateArr = dateArr;
		this.passengers = passengers;
		this.cabinClass = cabinClass;
		this.flightType = flightType;
	}
	public FlightInfo() {
	}
	public String getAirportDep() {
		return airportDep;
	}
	public void setAirportDep(String airportDep) {
		this.airportDep = airportDep;
	}
	public String getAirportArr() {
		return airportArr;
	}
	public void setAirportArr(String airportArr) {
		this.airportArr = airportArr;
	}
	public int getDateDep() {
		return dateDep;
	}
	public void setDateDep(int dateDep) {
		this.dateDep = dateDep;
	}
	public int getDateArr() {
		return dateArr;
	}
	public void setDateArr(int dateArr) {
		this.dateArr = dateArr;
	}
	public int getPassengers() {
		return passengers;
	}
	public void setNumberOfPassengers(int passengers) {
		this.passengers = passengers;
	}
	public String getCabinClass() {
		return cabinClass;
	}
	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

}
