package interface_quiz;

public class Product implements Promotion {
	private String name;
	private int price;
	private int weight;

	Product(String name, int price, int weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public int getWeight() {
		return this.weight;
	}

	public int getPrice() {
		return this.price;
	}
}
