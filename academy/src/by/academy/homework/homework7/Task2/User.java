package by.academy.homework.homework7.Task2;

//b) Добавить класс User, который наследуется от Person, с полями: login, password, email
//c) Добавить гетеры, сетеры. Добавить метод printUserInfo в User.
//Вывести с помощью рефлексии все поля и методы,

public class User extends Person {

	public String login;
	private String password;
	private String email;

	public User(String firstName, String lastName, Integer age, String dateOfBirth, String login, String password,
			String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.login = login;
		this.password = password;
		this.email = email;

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void printUserInfo() {
		System.out.println(getLogin() + " " + getEmail());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" User [name=");
		builder.append(getFirstName());
		builder.append(", LastName=");
		builder.append(getLastName());
		builder.append(", age=");
		builder.append(getAge());
		builder.append(", dateOfBirth=");
		builder.append(getDateOfBirth());
		builder.append(", login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}
