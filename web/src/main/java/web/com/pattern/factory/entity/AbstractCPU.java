package web.com.pattern.factory.entity;

/**
 * 抽象产品--CPU
 * @author huangxu
 *
 */
public abstract class AbstractCPU {
	
	/**
	 * 品牌
	 */
	protected String brand;
	
	/**
	 * 价格
	 */
	protected int price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	} 
	
}
