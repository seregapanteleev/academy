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

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Наименование товара - ");
		stringBuilder.append(getName() + "\n");
		stringBuilder.append("Цена - ").append(getPrise() + "\n");
		stringBuilder.append("Количество - ").append(getQuantity() + "\n");
		stringBuilder.append("Производитель - ").append(getManufacture());
		return stringBuilder.toString();
	}

}
