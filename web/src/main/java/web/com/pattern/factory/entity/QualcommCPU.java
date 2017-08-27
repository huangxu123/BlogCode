package web.com.pattern.factory.entity;

/**
 * 具体产品,高通--抽象AbstractCPU
 * @author huangxu
 *
 */
public class QualcommCPU extends AbstractCPU{

	/**
	 * 型号
	 */
	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public QualcommCPU(String model) {
		super();
		this.model = model;
	}

}
