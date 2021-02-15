package by.academy.deal;

public class Tablet extends Product {

	Double ram;
	Double storage;

	public Tablet(String name, double prise, String manufacture, Integer quantity, double ram, double storage) {
		super(name, prise, manufacture, quantity);
		this.ram = ram;
		this.storage = storage;
	}

	public Double getRam() {
		return ram;
	}

	public void setRam(Double ram) {
		this.ram = ram;
	}

	public Double getStorage() {
		return storage;
	}

	public void setStorage(Double storage) {
		this.storage = storage;
	}

	@Override
	public double discount() {
		if (ram <= 2 || storage <= 16) {
			return 0.8;
		}
		return 1;
	}

}
