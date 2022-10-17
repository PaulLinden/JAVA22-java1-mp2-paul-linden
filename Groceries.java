package items;

public class Groceries {

	private String items;
	private double price;
	private int amount;

	public Groceries(String items, double price, int amount) {

		this.setItems(items);
		this.setAmount(amount);
		this.price = price;
	}

	public int decreaseAmount() {

		setAmount(getAmount() - 1);

		return getAmount();
	}

	public double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
