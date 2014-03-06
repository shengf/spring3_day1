package cn.itcast.spring.b_instance;

/**
 * Bean2 工厂类
 * 
 * @author seawind
 * 
 */
public class Bean2Factory {
	public static Bean2 getBean2() {
		System.out.println("静态工厂方法执行...");
		return new Bean2();
	}
}
