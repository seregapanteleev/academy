package by.academy.homework.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

public class Task4 {

	public static void main(String[] args) {

		Random random = new Random();
		ArrayList<Integer> arrayList = new ArrayList<>();

		int count = 0;
		while (count < 10) {
			arrayList.add(random.nextInt(11));
			count++;
		}
		System.out.println(arrayList);
		Iterator<Integer> iterator = arrayList.iterator();
		int max = arrayList.get(0);
		while (iterator.hasNext()) {
			int a = iterator.next();
			if (a > max) {
				max = a;
			}
		}
		System.out.println(max);
	}

}
