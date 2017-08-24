package web.com.pattern.factory.service;

import org.springframework.stereotype.Service;

/**
 * 抽象工厂
 * @author huangxu
 *
 * @param <T>
 */
@Service
public interface EntityFactory<T> {

	T product();  
}
