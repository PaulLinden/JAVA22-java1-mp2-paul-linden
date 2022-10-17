package discount;

import items.Groceries;

public class Discount extends Groceries {

	private double oneOf;

	public Discount(String items, double price, int amount, double oneOf) {
		super(items, price, amount);

		this.oneOf = oneOf;

	}

	public void discountPrice(double rabbat) {

		double newPris = (double) getPrice() * oneOf;

		setPrice(newPris);
	}

}