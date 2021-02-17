package by.academy.deal;

public abstract class Product  {

	private String name;
	private Double prise;
	protected String manufacture;
	protected Integer quantity;

	Product() {
		super();
	}

	public Product(String name, double prise, String manufacture, Integer quantity) {
		super();
		this.name = name;
		this.prise = prise;
		this.manufacture = manufacture;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrise() {
		return prise;
	}

	public void setPrise(Double prise) {
		this.prise = prise;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public abstract double discount();

	public final double calcFinalPrise() {
		return prise * quantity * discount();
	}
	public abstract String toString();
	 
}
