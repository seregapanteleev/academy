package by.academy.homework.homework6.task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию.
//Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге.
//Назовите файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в файл пользователя.
//Не забываем закрывать потоки.
//В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)

public class Main {

	public static void main(String[] args) {

		ArrayList<User> listUser = new ArrayList<User>();
		listUser.add(new User("Maksim", "Gogon", 32));
		listUser.add(new User("Ivan", "Pogon", 33));
		listUser.add(new User("Mark", "Valuev", 35));
		listUser.add(new User("Lavrentiy", "Stalin", 82));
		listUser.add(new User("Iosif", "Beriya", 76));
		listUser.add(new User("Bob", "Sqerpens", 100));
		listUser.add(new User("Jenia", "Puprud", 32));
		listUser.add(new User("Valera", "Logon", 32));
		listUser.add(new User("Vasiliy", "Zogon", 32));
		listUser.add(new User("Pasha", "Fogon", 37));

		File catalog = new File("src/by/academy/homework/homework6/task3/Users");
		if (!catalog.exists()) {
			catalog.mkdir();
		}
		for (User user : listUser) {
			File file = new File(catalog, user.getFirstName() + "_" + user.getLastName() + ".txt");

			try (FileOutputStream outputStream = new FileOutputStream(file);
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
				objectOutputStream.writeObject(user);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
