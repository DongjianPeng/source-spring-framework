package top.murphypen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.murphypen.bean.MyBean;

@Configuration
@ComponentScan(basePackages = {"top.murphypen"})
public class MySpringApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MySpringApplication.class);
		MyBean myBean = applicationContext.getBean(MyBean.class);
		myBean.print();
	}
}