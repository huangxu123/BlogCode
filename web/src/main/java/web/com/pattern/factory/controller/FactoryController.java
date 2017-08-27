package web.com.pattern.factory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import web.com.base.controller.BaseController;
import web.com.pattern.factory.entity.LeicaCamera;
import web.com.pattern.factory.entity.MTKCPU;
import web.com.pattern.factory.entity.QualcommCPU;
import web.com.pattern.factory.entity.SonyCamera;
import web.com.pattern.factory.service.ICPUFactory;
import web.com.pattern.factory.service.IPhoneFactory;

/**
 * 访问测试工厂方法
 * 
 * @author huangxu
 *
 */
@Controller
@RequestMapping(value="factory")
public class FactoryController extends BaseController{

	@Autowired
	@Qualifier("QualcommCPUFactoryImpl")
	private ICPUFactory<QualcommCPU> qualcommCPUFactory;

	@Autowired
	@Qualifier("MTKCPUFactoryImpl")
	private ICPUFactory<MTKCPU> mTKCPUFactory;
	
	@Autowired
	@Qualifier("MiPhoneFactoryImpl")
	private IPhoneFactory<QualcommCPU, SonyCamera> miPhoneFactory;

	@Autowired
	@Qualifier("HuaWeiPhoneFactoryImpl")
	private IPhoneFactory<MTKCPU, LeicaCamera> huaWeiPhoneFactory;
	
	/**
	 * 设计模式---工厂方法
	 * 
	 * 一个抽象产品，多个具体产品
	 * 一个抽象工厂，多个具体工厂
	 * 一个具体工厂，生产一个具体产品
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="base")
	public String base(){
		
		QualcommCPU cpu_1 = qualcommCPUFactory.product();
		MTKCPU cpu_2 = mTKCPUFactory.product();
		
		logger.info("工厂方法模式：两个具体工厂，QualcommCPU："+cpu_1.getModel()+",MTKCPU:"+cpu_2.getCoreNumber());
		return "success";
	}
	
	/**
	 * 设计模式---抽象工厂
	 * 多个抽象产品，多个具体产品
	 * 一个抽象工厂，多个具体工厂
	 * 一个具体工厂，生产多个具体产品
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="abs")
	public String abs(){
		
		QualcommCPU miCPU =  miPhoneFactory.product_cpu();
		SonyCamera miCamera = miPhoneFactory.product_camera();
		logger.info("抽象工厂：miCPU"+miCPU.getModel()+",miCamera:"+miCamera.getType());
		
		MTKCPU huaweiCPU =  huaWeiPhoneFactory.product_cpu();
		LeicaCamera huaweiCamera =  huaWeiPhoneFactory.product_camera();
		logger.info("抽象工厂：huaweiCPU："+huaweiCPU.getCoreNumber()+",huaweiCamera:"+huaweiCamera.getLensNumber());
		
		return "success";
	}
}
