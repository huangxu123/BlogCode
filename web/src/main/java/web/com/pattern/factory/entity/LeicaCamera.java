package web.com.pattern.factory.entity;

/**
 * 具体产品，徕卡相机--抽象产品AbstractCamera
 * @author huangxu
 *
 */
public class LeicaCamera extends AbstractCamera{

	/**
	 * 镜头数
	 */
	private int lensNumber;

	public int getLensNumber() {
		return lensNumber;
	}

	public void setLensNumber(int lensNumber) {
		this.lensNumber = lensNumber;
	}

	public LeicaCamera(int lensNumber) {
		super();
		this.lensNumber = lensNumber;
	}

}
