package by.academy.homework.homework4.task1;

import java.util.Scanner;

public class InputDate {
	String strDate;
	Scanner scan = new Scanner(System.in);
	DateValidator vDate = new DateValidator();

	public String input() {
		do {
			strDate = scan.nextLine();
			if (!vDate.isValid(strDate)) {
				System.out.println("NO NO NO");
				System.out.println("Input date in format dd-mm-yyyy ");
			} else {
				System.out.println("OK");
			}
		} while (!vDate.isValid(strDate));
		return strDate;
	}
}
