package web.com.pattern.factory.service;

import org.springframework.stereotype.Service;

import web.com.pattern.factory.entity.DatebaseEntity;

/**
 * 具体工厂--抽象工厂EntityFactory
 * 具体产品DatebaseEntity
 * @author huangxu
 *
 */
@Service("datebaseEntityFactory")
public class DatebaseEntityFactoryImpl implements EntityFactory<DatebaseEntity>{

	public DatebaseEntity product() {
		DatebaseEntity entity = new DatebaseEntity("hello");
		return entity;
	}

}
