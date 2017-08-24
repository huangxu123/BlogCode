package web.com.pattern.factory.entity;

/**
 * 具体产品B--抽象产品AbstractEntity2
 * @author huangxu
 *
 */
public class BImplEntity2 extends AbstractEntity2{

	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BImplEntity2(String phone) {
		super();
		this.phone = phone;
	}
	
}
