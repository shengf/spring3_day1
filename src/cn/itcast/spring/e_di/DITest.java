package cn.itcast.spring.e_di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 依赖注入 测试
public class DITest {
	@Test
	// 构造器注入
	public void demo1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
	}

	@Test
	// setter方法注入
	public void demo2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Car2 car2 = (Car2) applicationContext.getBean("car2");
		System.out.println(car2);
	}

	@Test
	// setter方法注入复杂对象
	public void demo3() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(employee);
	}

	@Test
	// 测试 SpEL注入
	public void demo4() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Car2 car2 = (Car2) applicationContext.getBean("car2_2");
		System.out.println(car2);
	}

	@Test
	// 注入集合类型属性
	public void demo5() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CollectionBean collectionBean = (CollectionBean) applicationContext
				.getBean("collectionBean");
		System.out.println(collectionBean);
	}

}
