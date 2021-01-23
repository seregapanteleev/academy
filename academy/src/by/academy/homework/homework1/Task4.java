package by.academy.homework1;

public class Task4 {

	public static void main(String[] args) {

		double a = 2;
		double deg = 1;
		double exp = 0;
		while (exp <= 1_000_000) {
			exp = Math.pow(a, deg);
			deg++;
			System.out.println(deg - 1);
			exp = Math.pow(a, deg);
		}
	}
}
