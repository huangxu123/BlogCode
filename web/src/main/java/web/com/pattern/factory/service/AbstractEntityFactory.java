package web.com.pattern.factory.service;

import web.com.pattern.factory.entity.AbstractEntity;
import web.com.pattern.factory.entity.AbstractEntity2;

/**
 * 抽象工厂--抽象产品AbstractEntity和AbstractEntity2
 * @author huangxu
 *
 */
public interface AbstractEntityFactory {

	AbstractEntity product_1();

	AbstractEntity2 product_2();
}
