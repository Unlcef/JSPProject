package spring.mvc.ex.member;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class memberMain {
	public static void main(String[] args) {
		
	
	AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext_main.xml"); // Spring container 호출
	MemberImpl member = (MemberImpl) factory.getBean("mem");

	System.out.println("이름 : " + member.getName());
	System.out.println("아이디 : " + member.getId());
	System.out.println("이메일 : " + member.getEmail());
	factory.close();
	}
}
