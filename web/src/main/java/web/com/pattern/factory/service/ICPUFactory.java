package web.com.pattern.factory.service;

import web.com.pattern.factory.entity.AbstractCPU;

/**
 * CPU抽象工厂
 * @author huangxu
 *
 * @param <T>
 */
public interface ICPUFactory<T extends AbstractCPU> {

	T product();  
}
