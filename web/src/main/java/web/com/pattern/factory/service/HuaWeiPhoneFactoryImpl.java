package web.com.pattern.factory.service;

import org.springframework.stereotype.Service;

import web.com.pattern.factory.entity.LeicaCamera;
import web.com.pattern.factory.entity.MTKCPU;

/**
 * 具体工厂--IPhoneFactory
 * 
 * @author huangxu
 *
 */
@Service("HuaWeiPhoneFactoryImpl")
public class HuaWeiPhoneFactoryImpl implements IPhoneFactory<MTKCPU, LeicaCamera>{

	public MTKCPU product_cpu() {
		MTKCPU de = new MTKCPU(10);
		return de;
	}

	public LeicaCamera product_camera() {
		LeicaCamera ie2 = new LeicaCamera(2);
		return ie2;
	}

}
