package by.academy.lesson2;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ���");
		String s = sc.next();
		System.out.println("������ " + s);
		sc.close();
		
		
	}
}
