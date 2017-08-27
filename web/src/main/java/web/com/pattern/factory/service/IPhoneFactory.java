package web.com.pattern.factory.service;

import web.com.pattern.factory.entity.AbstractCPU;
import web.com.pattern.factory.entity.AbstractCamera;

/**
 * 抽象工厂--抽象产品AbstractCPU和AbstractCamera
 * @author huangxu
 *
 */
public interface IPhoneFactory<T1 extends AbstractCPU,T2 extends AbstractCamera>{

	T1 product_cpu();

	T2 product_camera();
}
