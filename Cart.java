package customer;

public class Cart {

	private double total;
	private int numberOfItems;
	private int addItem = 1;

	public Cart(int total, int numberOfItems) {
		this.total = total;
		this.numberOfItems = numberOfItems;
	}

	public int addItem() {

		setNumberOfItems(getNumberOfItems() + addItem);

		return getNumberOfItems();
	}

	public void priceCalc(double pris) {

		setTotal(getTotal() + pris);

	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
