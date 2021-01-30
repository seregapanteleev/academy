package by.academy.homework.homework2;

import java.util.Random;

import java.util.Scanner;

public class Deal {
	static void rasdacha(int n, String[] arr) {
		int a = 5;// карт на игрока по условию
		for (int i = 0; i < a * n; i++) {
			System.out.printf("%-3s ", arr[i]);
			if (i % 5 == 5 - 1) {
				System.out.println();
			}
		}
	}

	static String[] koloda() {
		String[] mast = "♠,♥,♣,♦".split(",");
		String[] karta = "A,2,3,4,5,6,7,8,9,10,J,Q,K".split(",");
		String[] koloda = new String[52];
		int i = 0;
		for (String smast : mast) {
			for (String skarta : karta) {
				koloda[i] = new String(skarta + smast);
				i++;
			}
		}
		return koloda;
	}

	static String[] peretasovali(String[] tasuy) {
		Random rand = new Random();
		for (int i = 0; i < tasuy.length; i++) {
			int j = rand.nextInt(tasuy.length);
			String temp = tasuy[i];
			tasuy[i] = tasuy[j];
			tasuy[j] = temp;
		}
		return tasuy;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Введите количество игроков");
			n = sc.nextInt();
			if (n < 2 || n > 10) {
				System.out.println("!!!Количество игроков от 2 до 10!!!");
			}
		} while (n < 2 || n > 10);
		sc.close();
		rasdacha(n, peretasovali(koloda()));
	}
}
