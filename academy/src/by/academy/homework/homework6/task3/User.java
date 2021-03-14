package by.academy.homework.homework6.task3;

import java.io.Serializable;

//Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст).

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	String firstName;
	String lastName;
	int age;

	public User(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
}
