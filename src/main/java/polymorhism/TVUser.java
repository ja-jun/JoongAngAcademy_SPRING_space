package polymorhism;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext container = 
				new GenericXmlApplicationContext("bbb.xml"); // 컨테이너 가동 하겠다...
		
		TV tv = (TV)container.getBean("tv"); // Dependency Lookup(뽑아오겠다)..
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();		
		tv.powerOff();
	}

}
