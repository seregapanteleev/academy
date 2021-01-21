package cat;

public class Application {

	public static void main(String... args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat(Васька);
		
		cat1.eat();
		cat1.grow();
		cat1.sleep();
		cat1.walk();

		cat2.eat();
		cat2.grow();
		cat2.sleep();
		cat2.walk();

	}

}
