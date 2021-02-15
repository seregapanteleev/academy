package by.academy.deal;

import java.time.LocalDate;
import java.util.Scanner;

import by.academy.deal.validating.BelarusPhoneValidator;
import by.academy.deal.validating.EmailValidator;

public class Application {

	public static void main(String[] args) {
		Person seller = new Person("OAO market", "+375295555555", "market@mail.com", 0, "01-01-1970");
		Person buyer = new Person();

		LocalDate date = LocalDate.now();
		String s;
		Scanner scan = new Scanner(System.in);
		DateValidator vDate = new DateValidator();
		do {
			System.out.println("Input date");
			s = scan.nextLine();
		} while (!vDate.isValid(s));
		vDate.printS(s);

		System.out.println("Input buyer name");
		buyer.setName(scan.nextLine());

		BelarusPhoneValidator vPhone = new BelarusPhoneValidator();
		do {
			System.out.println("Input buyer Belarusian namber phone");
			s = scan.nextLine();
			buyer.setPhone(s);
		} while (!vPhone.isValid(s));

		EmailValidator vMail = new EmailValidator();
		do {
			System.out.println("Input buyer Email");
			s = scan.nextLine();
			buyer.setEmail(s);
		} while (!vMail.isValid(s));

		System.out.println("Input buyer money");
		buyer.setMoney(scan.nextDouble());
		scan.nextLine();
		do {
			System.out.println("Input buyer dateOfBirth");
			s = scan.nextLine();
			buyer.setDateOfBirth(s);
		} while (!vDate.isValid(s));

		scan.close();

		Deal deal = new Deal(seller, buyer, date);

		deal.addProduct(new Cheese("сыр Гауда", 10.52, "Rassia", 25));
		deal.addProduct(new Vine("вино Кадарка", 11.2, "Belarus", 10));
		deal.addProduct(new Tablet("Lenovo Tab", 22.0, "China", 5, 4, 32));
		deal.checkBill();
		deal.deal();
	}
}
