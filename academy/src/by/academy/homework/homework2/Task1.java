package by.academy.homework.homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите строку");
		String str1 = scan.nextLine();
		System.out.println("Введите еще одну строку");
		String str2 = scan.nextLine();
		long count = 0;
		long t = 0;
		boolean a = true;
		scan.close();
		if (str1.length() != str2.length()) {
			a = false;
		} else {
			for (int i = 0; i < str1.length(); i++) {
				char ch = str1.charAt(i);
				for (int k = 0; k < str1.length(); k++) {
					if (ch == str1.charAt(k)) {
						count++;
					}
				}
				for (int j = 0; j < str2.length(); j++) {
					if (str1.charAt(i) == str2.charAt(j)) {
						t++;
					}
				}
				System.out.println(i + " " + t + " " + count);
				if (t == 0) {
					a = false;
				} else if (t != count) {
					a = false;
				}
				t = 0;
				count = 0;
			}
		}
		System.out.println(a);
	}

}
