package Assignment1;

public class TV implements Comparable<TV>{
	int size;
	String brand;
	int price;
	public TV(int size, String brand, int price) {
		super();
		this.size = size;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "TV [size=" + size + ", brand=" + brand + ", price=" + price + "]";
	}
	@Override
	public int compareTo(TV o) {
		
		return this.price-o.price;
	}
	

}
