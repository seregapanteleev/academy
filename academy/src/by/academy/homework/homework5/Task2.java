package by.academy.homework.homework5;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. 
//Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. 
//Замерьте время, которое потрачено на это. 

public class Task2 {

	private static Collection<Integer> addList(Collection<Integer> collection) {
		int a = 1;
		while (a <= 1000_000) {
			collection.add(a);
			a++;
		}
		return collection;

	}

	private static void arrayListGet(ArrayList<Integer> colection) {
		Random random = new Random();
		int a = 0;
		while (a < 10_000) {
			int i = random.nextInt(colection.size());
			colection.get(i);
			a++;
		}
	}

	private static void linkedListGet(LinkedList<Integer> colection) {
		Random random = new Random();
		int a = 0;
		while (a < 10_000) {
			int i = random.nextInt(colection.size());
			colection.get(i);
			a++;
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		LocalTime startAddArr = LocalTime.now();
		addList(arrayList);
		System.out.println("заполнение арейлист " + (LocalTime.now().getNano() - startAddArr.getNano()) + " nanosec.");

		LinkedList<Integer> linkedList = new LinkedList<>();
		LocalTime startAddLink = LocalTime.now();
		addList(linkedList);
		System.out.println("заполнение линклист " + (LocalTime.now().getNano() - startAddLink.getNano()) + " nanosec.");

		LocalTime startGetArr = LocalTime.now();
		arrayListGet(arrayList);
		System.out.println("выборка из арейлист " + (LocalTime.now().getNano() - startGetArr.getNano()) + " nanosec.");

		LocalTime startGetLink = LocalTime.now();
		linkedListGet(linkedList);
		System.out.println("выборка из линклист " + (LocalTime.now().getSecond() - startGetLink.getSecond()) + " sec!!!");

	}
}