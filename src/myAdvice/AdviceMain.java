package myAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceMain {

	public static void main(String[] args) {
		String[] config = new String[]{"config.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		AdviceTest a = (AdviceTest)context.getBean("adviceTest");
		a.Test1();
		a.Test2();
		a.Test3();
	}
}
