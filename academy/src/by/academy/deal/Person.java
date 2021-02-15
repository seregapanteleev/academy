package by.academy.deal;

public class Person {
	String name;
	String phone;
	String email;
	Double money;
	String dateOfBirth;
	public Person(String name, String phone, String email, double money, String dateOfBirth ) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.money = money;
		this.dateOfBirth = dateOfBirth; 
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}

}
