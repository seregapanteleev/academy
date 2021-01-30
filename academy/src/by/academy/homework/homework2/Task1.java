package by.academy.homework.homework2;

import java.util.Scanner;

public class Task1 {
	static boolean permutation(String str, String ing) {
		if (str.length() != ing.length()) {
			return false;
		}
		int[] simbol = new int[128]; // таблица ASCII
		char[] str_array = str.toCharArray();
		for (char c : str_array) {
			simbol[c]++;
		}
		for (int i = 0; i < ing.length(); i++) {
			int c = (int) ing.charAt(i);
			simbol[c]--;
			if (simbol[c] < 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите строку");
		String str1 = scan.nextLine();
		System.out.println("Введите еще одну строку");
		String str2 = scan.nextLine();
		System.out.println(permutation(str1, str2)); 
		scan.close();
	}
}
