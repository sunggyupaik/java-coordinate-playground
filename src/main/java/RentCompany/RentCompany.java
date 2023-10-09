package RentCompany;

import java.util.LinkedHashMap;
import java.util.Map;

public class RentCompany {
	private static Map<Car, Integer> map;

	public static RentCompany create() {
		map = new LinkedHashMap<>();

		return new RentCompany();
	}

	public void addCar(Car car) {
		map.put(car, (int) car.getChargeQuantity());
	}

	public String generateReport() {
		StringBuilder sb = new StringBuilder();

		map.forEach((k, v) -> {
			sb.append(k.getName()).append(" : ").append(v).append("리터").append(System.getProperty("line.separator"));
		});

		return sb.toString();
	}
}
