package polymorhism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv") // tv라는 id 붙인 것.
public class LgTv implements TV {
	
	@Autowired // DI... 스프링 프레임워크에서 가장 중요한 어노테이션(핵심)...
			// 이 컨테이너 내에서 스피커 타입에 해당하는 인스턴스가 있으면 주입한다. null값이 아니다. 
			// 무조건 주입이 하려고 한다. 1개는 존재해야한다. null값은 안나온다.(spring의 세심한 배려) 
			// 버그(exception)....주입된게 없으면 no such bean.... 단, 2개를 넣으면 no unique bean 결론 : 한개만 넣어야한다. 
	private Speaker speaker; // null 값
	
	public LgTv() {
		System.out.println("lg tv 생성됨1");
	}

	@Override
	public void powerOn() {
		System.out.println("LG TV --- 전원을 켠다.");

	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();

	}

	@Override
	public void powerOff() {
		System.out.println("LG TV --- 전원을 끈다.");

	}

}
