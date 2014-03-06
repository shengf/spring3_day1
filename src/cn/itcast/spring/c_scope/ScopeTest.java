package cn.itcast.spring.c_scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
	@Test
	// 通过scope属性指定 Bean 实例范围
	public void demo() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Product product = (Product) applicationContext.getBean("product");
		System.out.println(product);
		Product product2 = (Product) applicationContext.getBean("product");
		System.out.println(product2);
	}
}
