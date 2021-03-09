package by.academy.homework.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Task1 {

//	Напишите метод, который на вход получает коллекцию объектов, 
//	а возвращает коллекцию уже без дубликатов.
	
	private static <T> Collection<T> removeDublicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 2, 1, 4, 5, 5, 6, 7));
		System.out.println(arrayList);
		System.out.println(removeDublicates(arrayList));
	}

}
