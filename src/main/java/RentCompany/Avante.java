package RentCompany;

public class Avante extends Car {
	private final int distance;

	public Avante(int distance) {
		this.distance = distance;
	}

	@Override
	double getDistancePerLiter() {
		return 15;
	}

	@Override
	double getTripDistance() {
		return distance;
	}

	@Override
	String getName() {
		return "RentCompany.RentCompany.Avante";
	}
}
