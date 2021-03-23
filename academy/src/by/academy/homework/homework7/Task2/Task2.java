package by.academy.homework.homework7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task2 {

	public static void main(String[] args) {

		Class<User> user = User.class;

		System.out.println("---getMethod---");
		try {
			System.out.println(user.getMethod("printUserInfo"));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		System.out.println();

		System.out.println("---getMethods---");
		Method[] methods = user.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println();

		System.out.println("---getField---");
		try {
			System.out.println(user.getField("firstName"));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println();

		System.out.println("---getFields---");
		Field[] fields = user.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println();

		System.out.println("---getDeclaredMethod---");
		try {
			System.out.println(user.getDeclaredMethod("printUserInfo"));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		System.out.println();

		System.out.println("---getDeclaredMethods---");
		Method[] declaredMethods = user.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}
		System.out.println();

		System.out.println("---getDeclaredField---");
		try {
			System.out.println(user.getDeclaredField("login"));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println();

		System.out.println("---getDeclaredFields---");
		Field[] declaredFields = user.getSuperclass().getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field);
		}
		System.out.println();

		User user1 = new User("Sergey", "Panteleev", 30, "04,05,90", "seregapanteleev", "qwerty",
				"sersgapanteleev@mail.ru");
		System.out.println(user1);

		Class<? extends User> userSet = user1.getClass();
		try {

			userSet.getSuperclass().getDeclaredField("firstName").set(user1, "Sergo");
			userSet.getSuperclass().getDeclaredField("lastName").set(user1, "Gorelov");
			userSet.getSuperclass().getDeclaredField("age").set(user1, 500);
			userSet.getSuperclass().getDeclaredField("dateOfBirth").set(user1, "00,00,00");
			userSet.getDeclaredField("login").set(user1, "login");

			Field setPassword = userSet.getDeclaredField("password");
			setPassword.setAccessible(true);
			setPassword.set(user1, "123");

			Field setEmail = userSet.getDeclaredField("email");
			setEmail.setAccessible(true);
			setEmail.set(user1, "lol@.com");

			Field[] superSetFields = userSet.getSuperclass().getDeclaredFields();
			for (Field field : superSetFields) {
				System.out.println(field.get(user1));
			}
			Field[] setFields = userSet.getDeclaredFields();
			for (Field field : setFields) {
				field.setAccessible(true);
				System.out.println(field.get(user1));

			}
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Method userPrintUserInfo = user.getDeclaredMethod("printUserInfo");
			System.out.println(userPrintUserInfo.invoke(user1));
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
			System.out.println(e.getMessage());
		}

	}

}
