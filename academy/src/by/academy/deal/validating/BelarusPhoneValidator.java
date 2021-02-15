package by.academy.deal.validating;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
	
	private Pattern p = Pattern.compile("\\+375((29)|(33)|(25))[1-9]{1}[0-9]{6}");

	@Override
	public boolean isValid(String s) {
		Matcher m = p.matcher(s);
		return m.matches();
	}
	public static void main(String[] args) {
		BelarusPhoneValidator val = new BelarusPhoneValidator();
		String s = "+375292692942";
		System.out.println(s + " " + val.isValid(s));
	}

}
