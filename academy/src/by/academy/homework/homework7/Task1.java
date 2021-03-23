package by.academy.homework.homework7;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String... args) {

		List<Long> longList = Stream.generate(() -> (long) (new Random().nextInt(100) * Math.PI - 20)).limit(100)
				.filter(i -> i < 100).sorted().collect(Collectors.toList());

		System.out.println(longList);

		Map<Long, String> mapList = longList.stream().skip(3).distinct()
				.collect(Collectors.toMap(i -> i, i -> "Number: " + i));

		System.out.print(mapList);
	}

}