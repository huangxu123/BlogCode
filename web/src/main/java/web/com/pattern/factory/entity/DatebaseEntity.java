package web.com.pattern.factory.entity;

/**
 * 具体产品--抽象AbstractEntity
 * @author huangxu
 *
 */
public class DatebaseEntity extends AbstractEntity{

	private String id;
	
	public DatebaseEntity(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
