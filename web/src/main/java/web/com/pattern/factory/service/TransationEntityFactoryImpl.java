package web.com.pattern.factory.service;

import org.springframework.stereotype.Service;

import web.com.pattern.factory.entity.TransationEntity;

/**
 * 具体工厂--抽象工厂EntityFactory
 * 具体产品TransationEntity
 * @author huangxu
 *
 */
@Service("transationEntityFactory")
public class TransationEntityFactoryImpl implements EntityFactory<TransationEntity> {

	public TransationEntity product() {
		TransationEntity entity = new TransationEntity("0000", "hello world");
		return entity;
	}

}
