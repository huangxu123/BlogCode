package web.com.pattern.factory.service;

import org.springframework.stereotype.Service;

import web.com.pattern.factory.entity.AbstractEntity;
import web.com.pattern.factory.entity.AbstractEntity2;
import web.com.pattern.factory.entity.DatebaseEntity;
import web.com.pattern.factory.entity.AImplEntity2;

/**
 * 抽象工厂--A工厂
 * 
 * @author huangxu
 *
 */
@Service("afactory")
public class AFactoryImpl implements AbstractEntityFactory{

	public AbstractEntity product_1() {
		DatebaseEntity de = new DatebaseEntity("0001");
		return de;
	}

	public AbstractEntity2 product_2() {
		// TODO Auto-generated method stub
		AImplEntity2 ie2 = new AImplEntity2("Bob");
		return ie2;
	}

}
