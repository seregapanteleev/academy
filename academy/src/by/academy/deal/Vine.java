package by.academy.deal;

public class Vine extends Product {

	public Vine(String name, double prise, String manufacture, Integer quantity) {
		super(name, prise, manufacture, quantity);
		
	}

	@Override
	public double discount() {
		if (manufacture.equals("Belarus")) {
			return 1.9;
		}
		return 1;
	}

}
