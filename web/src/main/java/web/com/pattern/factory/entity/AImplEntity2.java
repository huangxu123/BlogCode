package web.com.pattern.factory.entity;

/**
 * 具体产品A--抽象产品AbstractEntity2
 * @author huangxu
 *
 */
public class AImplEntity2 extends AbstractEntity2{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AImplEntity2(String name) {
		super();
		this.name = name;
	}
	
}
