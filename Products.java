package storage;

public class Products {

	private int code;
	private String name;
	private String size;
	private int price;
	private int stock;
	private String brand;
	
	public Products() {
		// TODO Auto-generated constructor stub
	}

	public Products(int code, String name, String size, int price, int stock, String brand) {
		super();
		this.code = code;
		this.name = name;
		this.size = size;
		this.price = price;
		this.stock = stock;
		this.brand = brand;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Products [code=" + code + ", name=" + name + ", size=" + size + ", price=" + price + ", stock=" + stock
				+ ", brand=" + brand + "]";
	}

}
