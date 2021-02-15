package by.academy.deal.validating;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	private Pattern p = Pattern.compile("\\+1[2-9]{1}[0-9]{2}[2-9]{1}[0-9]{2}[0-9]{4}");

	@Override
	public boolean isValid(String s) {
		Matcher m = p.matcher(s);
		return m.matches();
	}

	public static void main(String[] args) {
		AmericanPhoneValidator val = new AmericanPhoneValidator();
		String s = "+17529269294";
		System.out.println(s + " " + val.isValid(s));
	}

}
