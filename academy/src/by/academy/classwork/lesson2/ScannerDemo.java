package by.academy.lesson2;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите имя");
		String s = sc.next();
		System.out.println("Привет " + s);
		sc.close();
		
		
	}
}
