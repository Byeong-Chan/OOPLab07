package byeongChan;

abstract public class Product {
	double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
		else
			System.out.println("Invalid.");
	}
	
	abstract public String getName();
}
