package RentCompany;

public class Sonata extends Car {
	private final int distance;

	public Sonata(int distance) {
		this.distance = distance;
	}

	@Override
	double getDistancePerLiter() {
		return 10;
	}

	@Override
	double getTripDistance() {
		return distance;
	}

	@Override
	String getName() {
		return "RentCompany.Sonata";
	}
}
