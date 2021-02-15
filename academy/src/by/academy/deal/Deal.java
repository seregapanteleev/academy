package by.academy.deal;

import java.time.LocalDate;

public class Deal implements DealInterfase {

	public final static int SIZE_PRODUCT = 2;

	private Person seller;
	private Person buyer;
	private Product[] products;
	private LocalDate deadlineDate;
	private int productCounter;
	private Double checkSum = 0.0;

	public Deal() {
		super();
	}

	public Deal(Person seller, Person buyer, LocalDate deadlineDate) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.deadlineDate = deadlineDate;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public LocalDate getDeadlineDate() {
		return deadlineDate;
	}

	public void setDeadlineDate(LocalDate deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	public Double getCheckSum() {
		return checkSum;
	}

	public void setCheckSum(Double checkSum) {
		this.checkSum = checkSum;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	@Override
	public void addProduct(Product product) {

		if (products == null) {
			products = new Product[SIZE_PRODUCT];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}

		products[productCounter++] = product;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	@Override
	public void deleteProduct(int index) {

		if (index > products.length || index < 0) {
			System.out.println("Index of bound");
			return;
		}
		if (productCounter != index) {
			System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
		}
		products[productCounter] = null;
		productCounter--;
	}

	@Override
	public void checkBill() {
		for (Product tmp : products) {
			if (tmp == null) {
				break;
			} else {
				checkSum += tmp.calcFinalPrise();
				System.out.printf("%s\n", tmp.getName());
				System.out.printf("%6.2f  * %4s  = %8.2f\n", tmp.getPrise(), tmp.getQuantity(), tmp.calcFinalPrise());
				System.out.printf("%20s \n", -100 + tmp.discount() * 100 + "%");
			}
		}
		System.out.println("--------------------------");
		System.out.printf("%18s%8.2f\n", "Итого ", checkSum);
	}

	@Override
	public void deal() {
		if (getCheckSum() > buyer.getMoney()) {
			System.out.println("No money - No honey");
		} else {
			System.out.println("Okey deal");
			System.out.println("deadlineDate " + getDeadlineDate().plusDays(10));
			System.out.println("Buyer's money after deal " + (buyer.getMoney() - getCheckSum()));
			System.out.println("Seller's money after deal " + (seller.getMoney() + getCheckSum()));
		}

	}

}
