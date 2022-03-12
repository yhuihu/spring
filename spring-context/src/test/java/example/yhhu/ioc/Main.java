package example.yhhu.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Spring 容器入口 注解形式
		ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		// XML形式
//		ApplicationContext context = new ClassPathXmlApplicationContext();
	}
}
