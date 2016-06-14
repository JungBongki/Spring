package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String[] config = new String[]{"config.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		SayHello s1 = (SayHello)context.getBean("myBean");
		PropTest s2 = (PropTest)context.getBean("PropTest");
		s1.printMsg();
		s2.printInfo();
	}
}
