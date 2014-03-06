package cn.itcast.spring.e_di;

/**
 * 轿车 (构造函数注入属性)
 * 
 * @author seawind
 * 
 */
public class Car {
	private String name;
	private double price;

	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}

}
