package by.academy.homework.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите сумму покупки");
		int buy = scan.nextInt();
		System.out.println("Введите возраст");
		int age = scan.nextInt();

		if (buy < 100) {
			buy -= buy * 5 / 100;
		}
		if (buy >= 100 && buy < 200) {
			buy -= buy * 7 / 100;
		}
		if (buy >= 200 && buy < 300) {
			if (age > 18) {
				buy -= buy * (12 + 4) / 100;
			} else
				buy -= buy * (12 - 3) / 100;
		}
		if (buy >= 300 && buy < 400) {
			buy -= buy * 15 / 100;
		}
		if (buy >= 400) {
			buy -= buy * 20 / 100;
		}
		scan.close();
		System.out.println("ФИНАЛЬНАЯ СУММА = " + buy);
	}

}
