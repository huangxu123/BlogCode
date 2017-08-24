package web.com.base.entity;

public class BaseEntity {

	private String id;
	
	private String name;
	
	public BaseEntity(String id){
		this.id=id;
	};
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "id:"+this.id+",name:"+this.name;
	}

}
