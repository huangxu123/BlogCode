package web.com.pattern.factory.service;

import org.springframework.stereotype.Service;

import web.com.pattern.factory.entity.QualcommCPU;

/**
 * 具体工厂--抽象工厂CPUFactory
 * 具体产品QualcommCPU
 * @author huangxu
 *
 */
@Service("QualcommCPUFactoryImpl")
public class QualcommCPUFactoryImpl implements ICPUFactory<QualcommCPU>{

	public QualcommCPU product() {
		QualcommCPU entity = new QualcommCPU("835");
		return entity;
	}

}
