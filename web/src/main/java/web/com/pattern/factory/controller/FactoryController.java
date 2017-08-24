package web.com.pattern.factory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import web.com.pattern.factory.entity.DatebaseEntity;
import web.com.pattern.factory.entity.AImplEntity2;
import web.com.pattern.factory.entity.BImplEntity2;
import web.com.pattern.factory.entity.TransationEntity;
import web.com.pattern.factory.service.AbstractEntityFactory;
import web.com.pattern.factory.service.EntityFactory;

/**
 * 访问测试工厂方法
 * 
 * @author huangxu
 *
 */
@Controller
@RequestMapping(value="factory")
public class FactoryController {

	@Autowired
	private EntityFactory<DatebaseEntity> datebaseEntityFactory;

	@Autowired
	private EntityFactory<TransationEntity> transationEntityFactory;
	
	@Autowired
	@Qualifier("afactory")
	private AbstractEntityFactory afactory;

	@Autowired
	@Qualifier("bfactory")
	private AbstractEntityFactory bfactory;
	
	/**
	 * 设计模式---工厂方法
	 * 
	 * 一个抽象产品，多个具体产品
	 * 一个抽象工厂，多个具体工厂
	 * 一个具体工厂，生产一个具体产品
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="base")
	public String base(){
		DatebaseEntity entity_1 = datebaseEntityFactory.product();
		TransationEntity entity_2 = transationEntityFactory.product();
		
		return entity_1.getId()+entity_2.getCode();
	}
	
	/**
	 * 设计模式---抽象工厂
	 * 多个抽象产品，多个具体产品
	 * 一个抽象工厂，多个具体工厂
	 * 一个具体工厂，生产多个具体产品
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="abs")
	public String abs(){
		//a工厂--产品1
		DatebaseEntity de = (DatebaseEntity)afactory.product_1();
		//b工厂--产品1
		TransationEntity te = (TransationEntity)bfactory.product_1();
		//a工厂--产品2
		AImplEntity2 ie2 = (AImplEntity2)afactory.product_2();
		//b工厂--产品2
		BImplEntity2 be2 = (BImplEntity2)bfactory.product_2();
		
		return de.getId()+ie2.getName()+te.getCode()+be2.getPhone();
	}
}
