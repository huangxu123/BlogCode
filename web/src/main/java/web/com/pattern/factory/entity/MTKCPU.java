package web.com.pattern.factory.entity;

/**
 * 具体产品，联发科CPU--抽象AbstractCPU
 * @author huangxu
 *
 */
public class MTKCPU extends AbstractCPU{

	/**
	 * 核心数
	 */
	private int coreNumber;

	public int getCoreNumber() {
		return coreNumber;
	}

	public void setCoreNumber(int coreNumber) {
		this.coreNumber = coreNumber;
	}

	public MTKCPU(int coreNumber) {
		super();
		this.coreNumber = coreNumber;
	}
	
}
