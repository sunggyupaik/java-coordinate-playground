package RentCompany;

public class K5 extends Car {
	private final int distance;

	public K5(int distance) {
		this.distance = distance;
	}

	@Override
	double getDistancePerLiter() {
		return 13;
	}

	@Override
	double getTripDistance() {
		return distance;
	}

	@Override
	String getName() {
		return "RentCompany.K5";
	}
}
