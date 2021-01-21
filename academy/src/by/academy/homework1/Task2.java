package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите тип данных");
		String in = scan.next();
		System.out.println("¬ведите переменную");

		switch (in) {
		case "int":
			int var = scan.nextInt();
			System.out.println(var % 2);
			break;
		case "double":
			double vard = scan.nextDouble();
			System.out.println(vard * 0.7);
			break;
		case "float":
			float varf = scan.nextFloat();
			System.out.println(Math.pow(varf, 2));
			break;
		case "char":
			char varc = scan.next().charAt(0);
			System.out.println((int) varc);
			break;
		case "String":
			String vars = scan.nextLine();
			System.out.println("Hello" + vars);
			break;
		default:
			System.out.println("Unsupported type");
		}

	}

}
