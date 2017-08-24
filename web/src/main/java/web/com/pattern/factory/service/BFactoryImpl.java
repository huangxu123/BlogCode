package web.com.pattern.factory.service;

import org.springframework.stereotype.Service;

import web.com.pattern.factory.entity.AbstractEntity;
import web.com.pattern.factory.entity.AbstractEntity2;
import web.com.pattern.factory.entity.BImplEntity2;
import web.com.pattern.factory.entity.TransationEntity;

/**
 * 抽象工厂--B工厂
 * 
 * @author huangxu
 *
 */
@Service("bfactory")
public class BFactoryImpl implements AbstractEntityFactory{

	public AbstractEntity product_1() {
		TransationEntity te = new TransationEntity("0001","hello");
		return te;
	}

	public AbstractEntity2 product_2() {
		BImplEntity2 ie2 = new BImplEntity2("Luck");
		return ie2;
	}

}
