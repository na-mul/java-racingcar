package step3;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ResultView {
	public static Scanner scanner = new Scanner(System.in);

	private ResultView() {
	}

	public static void printGameStart() {
		System.out.println("\n실행 결과");
	}

	public static void printCarsLocation(List<Car> cars) {
		for(Car car: cars) {
			System.out.println(viewCarLocation(car));
		}
		System.out.println();
	}

	public static String viewCarLocation(Car car) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < car.getLocation(); i++) {
			result.append("-");
		}
		return result.toString();
	}

}