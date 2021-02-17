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
