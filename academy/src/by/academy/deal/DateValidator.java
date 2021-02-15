package by.academy.deal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.academy.deal.validating.Validator;

public class DateValidator implements Validator {
	private Pattern p = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /](0[1-9]|1[012])[- /](19|20)\\d\\d");

	@Override
	public boolean isValid(String s) {
		Matcher m = p.matcher(s);
		return m.matches();
	}

	public void printS(String s) {

		s = s.replaceAll("[/]", "-");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(s, formatter);
		System.out.println("День: " + date.getDayOfMonth());
		System.out.println("Месяц: " + date.getMonthValue());
		System.out.println("Year: " + date.getYear());

	}
}
