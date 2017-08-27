package web.com.pattern.factory.entity;

/**
 * 抽象产品--camera
 * @author huangxu
 *
 */
public abstract class AbstractCamera {

	/**
	 * 价格
	 */
	protected int price;
	
	/**
	 * 像素
	 */
	protected String pixels;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPixels() {
		return pixels;
	}

	public void setPixels(String pixels) {
		this.pixels = pixels;
	}
	
}
