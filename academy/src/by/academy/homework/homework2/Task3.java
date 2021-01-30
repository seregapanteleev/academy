package by.academy.homework.homework2;

public class Task3 {

	public static void main(String[] args) {
		String s1 = "pu2345po";
		String s2 = "su2345so";
		StringBuilder sb = new StringBuilder(s1.substring(0, s1.length() / 2));
		sb.append(s2.substring(s2.length() / 2));
		System.out.println(sb);
	}

}
