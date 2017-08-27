package web.com.pattern.factory.service;

import org.springframework.stereotype.Service;

import web.com.pattern.factory.entity.QualcommCPU;
import web.com.pattern.factory.entity.SonyCamera;

/**
 * 具体工厂--IPhoneFactory
 * 
 * @author huangxu
 *
 */
@Service("MiPhoneFactoryImpl")
public class MiPhoneFactoryImpl implements IPhoneFactory<QualcommCPU, SonyCamera>{

	public QualcommCPU product_cpu() {
		QualcommCPU te = new QualcommCPU("820");
		return te;
	}

	public SonyCamera product_camera() {
		SonyCamera ie2 = new SonyCamera("386");
		return ie2;
	}

}
