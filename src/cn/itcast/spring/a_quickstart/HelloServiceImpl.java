package cn.itcast.spring.a_quickstart;

// 实现类
public class HelloServiceImpl implements IHelloService {
	private String info;

	public void sayHello() {
		System.out.println("hello," + info);
	}

	// HelloServiceImpl 的实例 依赖 String 类型 info 数据
	// UML OOD设计中 依赖强调 方法中参数
	public void setInfo(String info) {
		this.info = info;
	}
}
