package by.academy.homework.homework2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите количество слов");
		int n = scan.nextInt();
		scan.nextLine();
		String[] words = new String[n];
		
		for (int i = 0; i < n; i++) {
			words[i] = scan.nextLine();
		}
		int max = 128;
		String smin = "";
		for (String s : words) {
			if (s.length() < 2) {
				smin = s;
				break;
			}
			int k = s.length();
			for (int i = 0; i < s.length(); i++) {
				if (i != s.lastIndexOf(s.charAt(i))) {
					k--;
				}
			}
			if (k < max) {
				max = k;
				smin = s;
			}
		}
		scan.close();
		System.out.printf("В слове %s число различных символов минимально", smin);
	}

}
