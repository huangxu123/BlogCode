package web.com.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import web.com.base.entity.BaseEntity;

public class BaseTest {

	@Test
	public void testObjectList(){
		
		List<BaseEntity> list = new ArrayList<BaseEntity>();
		
		BaseEntity entity_1 = new BaseEntity("b1");
		entity_1.setName("name-1");
		list.add(entity_1);
		
		System.out.println("----------part 1-----------");
		System.out.println("---entity-----hashcode:"+entity_1.hashCode()+"--------toString:"+entity_1.toString());
		System.out.println("---list-------hashcode:"+list.hashCode()+"--------toString:"+list.toString());
		System.out.println(list.get(0));
		
		entity_1.setId("b2");
		entity_1.setName("name-2");
		list.add(entity_1);
		
		System.out.println("----------part 2-----------");
		System.out.println("---entity-----hashcode:"+entity_1.hashCode()+"--------toString:"+entity_1.toString());
		System.out.println("---list-------hashcode:"+list.hashCode()+"--------toString:"+list.toString());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
	}
	
	@Test
	public void testOtherObjectList(){
		
		List<BaseEntity> list = new ArrayList<BaseEntity>();
		
		BaseEntity entity_1 = new BaseEntity("a1");
		entity_1.setName("name-3");
		list.add(entity_1);
		
		System.out.println("----------part 1-----------");
		System.out.println("---entity-----hashcode:"+entity_1.hashCode()+"--------toString:"+entity_1.toString());
		System.out.println("---list-------hashcode:"+list.hashCode()+"--------toString:"+list.toString());
		System.out.println(list.get(0));
		
		BaseEntity entity_2 = new BaseEntity("a2");
		entity_2.setName("name-4");
		list.add(entity_2);
		
		System.out.println("----------part 2-----------");
		System.out.println("---entity-----hashcode:"+entity_2.hashCode()+"--------toString:"+entity_2.toString());
		System.out.println("---list-------hashcode:"+list.hashCode()+"--------toString:"+list.toString());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
	}
	
	@Test
	public void testStringList(){
		
		String name = "";
		List<String> list = new ArrayList<String>();
		
		System.out.println("------------part 1------------");
		System.out.println("-----name:"+name+",hashcode:"+name.hashCode());
		System.out.println("-----list:"+list.toString()+",hashcode:"+list.hashCode());
		
		name="aaa";
		list.add(name);
		
		System.out.println("------------part 2------------");
		System.out.println("-----name:"+name+",hashcode:"+name.hashCode());
		System.out.println("-----list:"+list.toString()+",hashcode:"+list.hashCode());

		name="bbb";
		list.add(name);
		
		System.out.println("------------part 3------------");
		System.out.println("-----name:"+name+",hashcode:"+name.hashCode());
		System.out.println("-----list:"+list.toString()+",hashcode:"+list.hashCode());

	}
	
	@Test
	public void testIntList(){
		
		List<Integer> list = new ArrayList<Integer>();
		
		Integer age = 0;
		
		System.out.println("-----age:"+age+",hashcode:"+age.hashCode());
		System.out.println("-----list:"+list.toString()+",hashcode:"+list.hashCode());
		

		age=1;
		list.add(age);
		System.out.println("-----age:"+age+",hashcode:"+age.hashCode());
		System.out.println("-----list:"+list.toString()+",hashcode:"+list.hashCode());

		list.add(2);
		System.out.println("-----age:"+age+",hashcode:"+age.hashCode());
		System.out.println("-----list:"+list.toString()+",hashcode:"+list.hashCode());
		
		age=3;
		list.add(age);
		System.out.println("-----age:"+age+",hashcode:"+age.hashCode());
		System.out.println("-----list:"+list.toString()+",hashcode:"+list.hashCode());
	}
	
	
	@Test
	public void testObjectLinkList(){
		
		List<BaseEntity> list = new LinkedList<BaseEntity>();
		
		BaseEntity entity_1 = new BaseEntity("b1");
		entity_1.setName("name-1");
		list.add(entity_1);
		
		System.out.println("---entity-----hashcode:"+entity_1.hashCode()+"--------toString:"+entity_1.toString());
		System.out.println("---list-------hashcode:"+list.hashCode()+"--------size:"+list.size());
		System.out.println("----list----"+list.toString());
		System.out.println(list.get(0));
		
		entity_1.setId("b2");
		entity_1.setName("name-2");
		list.add(entity_1);
		
		System.out.println("---entity-----hashcode:"+entity_1.hashCode()+"--------toString:"+entity_1.toString());
		System.out.println("---list-------hashcode:"+list.hashCode()+"--------size:"+list.size());
		System.out.println("----list----"+list.toString());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
	}
	
}
