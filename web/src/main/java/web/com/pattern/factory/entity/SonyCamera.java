package web.com.pattern.factory.entity;

/**
 * 具体产品，索尼相机--抽象产品AbstractCamera
 * @author huangxu
 *
 */
public class SonyCamera extends AbstractCamera{

	/**
	 * 类型
	 */
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public SonyCamera(String type) {
		super();
		this.type = type;
	}

}
