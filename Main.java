package miniprojekt2;

import java.util.Scanner;

import customer.Cart;
import discount.Discount;
//import discount.Discount;
import items.Groceries;

public class Main {

	public static void main(String[] args) {

		System.out.println("!Valkommen till Lederburs livs!");
		System.out.println();

		Groceries choklad = new Groceries("Choklad", 10, 10);
		Groceries soda = new Groceries("Cola", 15, 40);
		Discount olw = new Discount("Olw", 10, 32, 0.99);
		Cart customerOne = new Cart(0, 0);

		olw.discountPrice(0);

		while (true) {

			System.out.println("Varor:");
			System.out.println("________________________________________________________");
			System.out.println(
					"1." + choklad.getItems() + " " + choklad.getPrice() + "kr." + "Antal: " + choklad.getAmount());
			System.out.println("2." + soda.getItems() + " " + soda.getPrice() + "kr." + "Antal: " + soda.getAmount());
			System.out.println("3." + olw.getItems() + " " + olw.getPrice() + "kr." + "Antal: " + olw.getAmount());
			System.out.println("________________________________________________________");

			System.out
					.println("Antal varot: " + customerOne.getNumberOfItems() + ". Kostnad: " + customerOne.getTotal());

			Scanner customer = new Scanner(System.in);

			try {
				int list = customer.nextInt();

				if (list < 1) {
					System.out.println("----------------------------------------------------------------");
					System.out.println("!Valj ett heltal inom menyn!");
					System.out.println("----------------------------------------------------------------");
					System.out.println();
				} else if (list > 4) {
					System.out.println("----------------------------------------------------------------");
					System.out.println("!Valj ett heltal inom menyn!");
					System.out.println("----------------------------------------------------------------");
					System.out.println();
				}

				switch (list) {

				case 1:
					choklad.decreaseAmount();
					customerOne.addItem();
					customerOne.priceCalc(choklad.getPrice());
					break;

				case 2:
					soda.decreaseAmount();
					customerOne.addItem();
					customerOne.priceCalc(soda.getPrice());
					break;

				case 3:
					olw.decreaseAmount();
					customerOne.addItem();
					customerOne.priceCalc(olw.getPrice());
					break;
				}

				if (list == 4) {
					System.out.println("Tack for ditt kop!");
					break;
				}
			} catch (Exception e) {
				System.out.println("----------------------------------------------------------------");
				System.out.println("!Fel inmatning!");
				System.out.println("Gor val genom att anvanda ett heltal i menyn. Avsluta med enter.");
				System.out.println("----------------------------------------------------------------");
			}
		}

	}

}
