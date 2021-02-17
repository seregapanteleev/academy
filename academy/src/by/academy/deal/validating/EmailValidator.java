package by.academy.deal.validating;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
	private Pattern p = Pattern.compile("\\w+@\\w+\\.\\w+");

	@Override
	public boolean isValid(String s) {
		Matcher m = p.matcher(s);
		return m.matches();
	}

	public static void main(String[] args) {
		EmailValidator val = new EmailValidator();
		String s = "seregapanteleev@mail.ru";
		System.out.println(s + " " + val.isValid(s));
	}

}

