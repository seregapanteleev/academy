package by.academy.homework.homework5;

import java.util.HashMap;
import java.util.Map;

//Имеется текст. Следует составить для него частотный словарь:
//Создать Map<Character, Integer> для символов, 
//в который мы заносим символ и его количество.
	
public class Task5 {

	private static void howSimbolsRepeat(String text) {

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, 0);
			}
			map.compute(ch, (key, val) -> val + 1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {

		String text = "asfdfKLKKKfaffaf ,,, ёёёёжжжжж ";
		howSimbolsRepeat(text);

	}

}
