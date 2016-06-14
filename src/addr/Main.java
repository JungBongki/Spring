package addr;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String[] config = new String[]{"config.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		Service service = (Service)context.getBean("addrService");
		service.addMember(new Member(0, "aaa", "111","India"));
		service.addMember(new 
				Member(0, "bbb", "222","Korea"));
		service.addMember(new Member(0, "ccc", "333","China"));
		ArrayList<Member> list = (ArrayList<Member>) service.getMembers();
		System.out.println(list);
		System.out.println(service.getMember(52));
		service.editMember(new Member(0, "ccc", "444","USA"));
		list=(ArrayList<Member>) service.getMembers();
		System.out.println(list);
		service.delMember(52);
		list=(ArrayList<Member>) service.getMembers();
		System.out.println(list);
	}
}
