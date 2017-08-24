package web.com.pattern.factory.entity;

/**
 * 具体产品--抽象AbstractEntity
 * @author huangxu
 *
 */
public class TransationEntity extends AbstractEntity{

	private String code;
	
	private String msg;

	
	public TransationEntity(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
