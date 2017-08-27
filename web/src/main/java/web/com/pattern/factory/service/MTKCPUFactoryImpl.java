package web.com.pattern.factory.service;

import org.springframework.stereotype.Service;

import web.com.pattern.factory.entity.MTKCPU;

/**
 * 具体工厂--抽象工厂CPUFactory
 * 具体产品MTKCPU
 * @author huangxu
 *
 */
@Service("MTKCPUFactoryImpl")
public class MTKCPUFactoryImpl implements ICPUFactory<MTKCPU> {

	public MTKCPU product() {
		MTKCPU entity = new MTKCPU(10);
		return entity;
	}

}
