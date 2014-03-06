package cn.itcast.spring.a_quickstart;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

// 测试程序
public class HelloServiceTest {
	public static void main(String[] args) {
		// 传统写法 （紧密耦合）
		HelloServiceImpl helloService = new HelloServiceImpl();
		// 手动调用 set 方法为 info 进行赋值
		helloService.setInfo("spring");
		helloService.sayHello();

		// 工厂 + 反射 + 配置文件 ，实例化 IHelloService的对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// 通过工厂 根据 配置名称 获得实例对象
		IHelloService iHelloService2 = (IHelloService) applicationContext
				.getBean("helloService");
		iHelloService2.sayHello();

		// 控制反转，对象的创建权 被反转到 Spring 框架
	}

	@Test
	// 读取工程根目录 下applicationContext.xml
	public void demo() {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"applicationContext.xml");
		IHelloService iHelloService2 = (IHelloService) applicationContext
				.getBean("helloService");
		iHelloService2.sayHello();
	}

	@Test
	// 使用BeanFactory 加载配置文件，实现工厂
	public void demo2() {
		// 使用XmlBeanFactory 加载Resource对象 （ClassPathResource 、
		// FileSystemResource）
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));
		IHelloService helloService = (IHelloService) beanFactory
				.getBean("helloService");
		helloService.sayHello();
	}
}
