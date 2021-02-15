package by.academy.deal;

public class Cheese extends Product {


	public Cheese(String name, double prise, String manufacture, Integer quantity) {
		super(name, prise, manufacture, quantity);
	}

	@Override
	public double discount() {
		if (quantity > 20) {
			return 0.9;
		}
		return 1;
	}
}
